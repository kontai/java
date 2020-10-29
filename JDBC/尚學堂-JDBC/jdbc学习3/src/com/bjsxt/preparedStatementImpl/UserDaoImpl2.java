package com.bjsxt.preparedStatementImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bjsxt.pojo.User;
import com.bjsxt.util.JdbcUtil;

/**
 * 完成用戶登錄功能:
 * 		分析:
 * 			根據用戶名和密碼查詢用戶信息
 * 
 * ----------
 * 	使用preparedStatement對像完成增刪改查
 * 
 * @author MyPC
 *
 */
public class UserDaoImpl2 {
	//查詢用戶信息
	public User getUserInfo(String uname,String upwd) throws SQLException{
		//聲明User對像
		User u=null;
		//創建連接對像
		Connection conn=JdbcUtil.getConnection();
		
		//創建sql命令
		String sql="select * from t_user where uname=? and upwd=?";
		//創建sql命令對像
		PreparedStatement ps=JdbcUtil.getPreparedStatement(sql, conn);
		//給佔位符賦值(佔位符從左到右角標從1開始)
		ps.setString(1, uname);
		ps.setString(2, upwd);
	
		//執行sql命令
		ResultSet rs=ps.executeQuery();
		//遍歷查詢結果
		while(rs.next()){
			u=new User();
			u.setUnum(rs.getInt("unum"));
			u.setUname(rs.getString("uname"));
			u.setUpwd(rs.getString("upwd"));
			return u;
		}
		//關閉資源
			JdbcUtil.closeAll(rs, ps, conn);
		//返回執行結果
		return u;
	}
	//新增--preparedStatement
		public int insUser2() throws ClassNotFoundException, SQLException{
			String sql="insert into t_user values(?,?,?)";
			int i=JdbcUtil.executeDML(sql, 20,"劉凱立","666");
			return i;
		}	
	//更新
		public int upUser(String uname,int unum) throws ClassNotFoundException, SQLException{

			return JdbcUtil.executeDML("update t_user set uname=? where unum=?","李思思",2);
		}	
	//刪除
		public int delUser(int unum) throws  SQLException{
			
			return JdbcUtil.executeDML("delete from t_user where unum=?",unum);
			
		}
		public static void main(String[] args) throws  SQLException {
			UserDaoImpl2 ud=new UserDaoImpl2();
			User u=ud.getUserInfo("李四", "456");
			int i=ud.delUser(1);
			System.out.println(u);	
		}
		
		
	/*//插入
	public int insUser() throws ClassNotFoundException, SQLException{
		//加載驅動
			Class.forName("oracle.jdbc.driver.OracleDriver");
		//創建連接對像
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "oracle");
		
		//創建sql命令對像
			Statement stmt=conn.createStatement();
		//創建sql命令
			String sql="insert into t_user values(3,'王五','999')";
			String sql1="insert into t_user values(4,'王五1','999')";
			String sql2="insert into t_user values(5,'王五2','999')";
			String sql3="insert into t_user values(6,'王五3','999')";
		//執行sql命令
			int i=stmt.executeUpdate(sql);
			i+=stmt.executeUpdate(sql1);
			i+=stmt.executeUpdate(sql2);
			i+=stmt.executeUpdate(sql3);
		//關閉資源
			stmt.close();
			conn.close();
			return i;
	}
	*/	
}
