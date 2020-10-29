package com.bjsxt.daoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.bjsxt.pojo.Student;
/**
 * 對開發需求的直觀映射是SQL語句.
 * 開發步驟:
 * 		業務需求分析
 * 		數據庫設計
 * 		sql語句設計
 * 		數據庫操作功能類實現
 * 		業務邏輯代碼實現
 * 		聯合測試
 * 		上線測試
 * 		維護
 * ----------------------------------
 * 對於增加刪除和修改除了Sql語句的聲明不一致以外,其他聲明基本一致.
 * 封裝的思想:
 * 		相同的保留,不同的傳參.
 * 
 * ----------------------------------
 * 使用Statement對像完成增加刪除修改
 * @author MyPC
 *
 */
public class StudentDaoImpl2 {

	//增加
		public int insStu(String sname,int sage,double money) throws ClassNotFoundException, SQLException{
			//加載驅動
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//創建連接對像
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "oracle");
			//創建sql命令對像
			Statement stmt=conn.createStatement();
			//創建sql命令
			String sql="insert into student values(stu_seq.nextval,'"+sname+"','"+sage+"','"+money+"')";
			//執行sql命令
			int i=stmt.executeUpdate(sql);
			//關閉資源
			stmt.close();
			conn.close();
			return i;
		}
	//刪除
		public int delStu(int snum) throws ClassNotFoundException, SQLException{
			//加載驅動
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//獲取連接對像
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "oracle");
			//獲取sql命令對像
			Statement stmt=conn.createStatement();
			//創建sql命令
			String sql="delete from student where snum="+snum;
			//執行sql命令
			int i=stmt.executeUpdate(sql);
			//關閉資源
			stmt.close();
			conn.close();
			return i;
		}
	//修改
		public int upStu(int snum,String newName) throws ClassNotFoundException, SQLException{
			//加載驅動
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//獲取連接對像
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "oracle");
			//獲取sql命令對像
			Statement stmt=conn.createStatement();
			//創建sql命令
			String sql="update student set sname='"+newName+"' where snum="+snum;
			//執行sql命令
			int i=stmt.executeUpdate(sql);
			//關閉資源
			stmt.close();
			conn.close();
			return i;	
		}
	//查詢
		public ArrayList<Student> getStudentInfo() throws ClassNotFoundException, SQLException{
			//聲明集合對像
			ArrayList<Student> ls=new ArrayList<>();
			//加載驅動
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//獲取連接對像
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "oracle");
			//獲取sql命令對像
			Statement stmt=conn.createStatement();
			//創建sql命令
			String sql="select * from student";
			//執行sql命令
			ResultSet rs=stmt.executeQuery(sql);
			//遍歷結果
			while(rs.next()){
				Student s=new Student();
				s.setSnum(rs.getInt("snum"));
				s.setSname(rs.getString("sname"));
				s.setSage(rs.getInt("sage"));
				s.setMoney(rs.getDouble("money"));
				ls.add(s);
			}
			//關閉資源
			rs.close();
			stmt.close();
			conn.close();
			return ls;
		}
			
	
}
