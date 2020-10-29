package com.bjsxt.preparedStatementImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bjsxt.pojo.User;

/**
 * �����Τ�n���\��:
 * 		���R:
 * 			�ھڥΤ�W�M�K�X�d�ߥΤ�H��
 * 
 * ----------
 * 	�ϥ�preparedStatement�ﹳ�����W�R��d
 * 
 * @author MyPC
 *
 */
public class UserDaoImpl {
	
		
	//�d�ߥΤ�H��
	public User getUserInfo(String uname,String upwd) throws ClassNotFoundException, SQLException{
		//�n��User�ﹳ
		User u=null;
		//�[���X��
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//�Ыسs���ﹳ
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "oracle");
		//�Ы�sql�R�O
		String sql="select * from t_user where uname=? and upwd=?";
		//�Ы�sql�R�O�ﹳ
		PreparedStatement ps=conn.prepareStatement(sql);
		//������Ž��(����űq����k���бq1�}�l)
		ps.setString(1, uname);
		ps.setString(2, upwd);
	
		//����sql�R�O
		ResultSet rs=ps.executeQuery();
		//�M���d�ߵ��G
		while(rs.next()){
			u=new User();
			u.setUnum(rs.getInt("unum"));
			u.setUname(rs.getString("uname"));
			u.setUpwd(rs.getString("upwd"));
			return u;
		}
		//�����귽
		rs.close();
		ps.close();
		conn.close();
		//��^���浲�G
		return u;
	}
	//�s�W--preparedStatement
		public int insUser2() throws ClassNotFoundException, SQLException{
			//�[���X��
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//�Ыسs���ﹳ
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "oracle");
			//�Ы�sql�R�O
			String sql="insert into t_user values(?,?,?)";
			//�Ы�sql�R�O�ﹳ
			PreparedStatement ps=conn.prepareStatement(sql);
			//������Ž��
				ps.setInt(1, 7);
				ps.setString(2,"����");
				ps.setString(3,"666");
				//����sql�R�O
				int i=ps.executeUpdate();
			//�����귽
				ps.close();
				conn.close();
			//��^���G
				return i;
		}	
	//��s
		public int upUser(String uname,int unum) throws ClassNotFoundException, SQLException{
			//�[���X��
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//����s���ﹳ
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "oracle");
			//�Ы�sql�R�O
			String sql="update t_user set uname=? where unum=?";
			//���sql�R�O�ﹳ
			PreparedStatement ps=conn.prepareStatement(sql);
			//������Ž��
			ps.setString(1, uname);
			ps.setInt(2, unum);
			//����sql�R�O
			int i=ps.executeUpdate();
			//�����귽
			ps.close();
			conn.close();
			//��^���G	
			return i;
		}	
	//�R��
		public int delUser(int unum) throws ClassNotFoundException, SQLException{
			
			//�[���X��
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//����s���ﹳ
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "oracle");
			//�Ы�sql�R�O
			String sql="delete from t_user where unum=?";
			//���sql�R�O�ﹳ
			PreparedStatement ps=conn.prepareStatement(sql);
			//������Ž��
			ps.setObject(1, unum);
			//����sql�R�O
			int i=ps.executeUpdate();
			//�����귽
			ps.close();
			conn.close();
			//��^���G	
			return i;
			
		}
		
		
		
	/*//���J
	public int insUser() throws ClassNotFoundException, SQLException{
		//�[���X��
			Class.forName("oracle.jdbc.driver.OracleDriver");
		//�Ыسs���ﹳ
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "oracle");
		
		//�Ы�sql�R�O�ﹳ
			Statement stmt=conn.createStatement();
		//�Ы�sql�R�O
			String sql="insert into t_user values(3,'����','999')";
			String sql1="insert into t_user values(4,'����1','999')";
			String sql2="insert into t_user values(5,'����2','999')";
			String sql3="insert into t_user values(6,'����3','999')";
		//����sql�R�O
			int i=stmt.executeUpdate(sql);
			i+=stmt.executeUpdate(sql1);
			i+=stmt.executeUpdate(sql2);
			i+=stmt.executeUpdate(sql3);
		//�����귽
			stmt.close();
			conn.close();
			return i;
	}
	*/	
}
