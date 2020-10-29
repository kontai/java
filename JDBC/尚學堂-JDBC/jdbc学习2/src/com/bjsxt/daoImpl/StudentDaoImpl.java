package com.bjsxt.daoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.bjsxt.pojo.Student;

public class StudentDaoImpl {
	//�d�ߩҦ��ǥͫH��
	public ArrayList<Student> getStudentInfo() throws ClassNotFoundException, SQLException{
		//�n��List���X
				ArrayList<Student> list=new ArrayList<>();
				//�[���X��
					Class.forName("oracle.jdbc.driver.OracleDriver");
				//�Ыسs���ﹳ
					Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","oracle");
				//�Ы�sql�R�O�ﹳ
					Statement stmt=conn.createStatement();
				//�Ы�Sql�R�O
					String sql="select * from student";
				//����Sql�R�O
					 ResultSet rs = stmt.executeQuery(sql);
					 while(rs.next()){
						 //�Ыؾǥ͹ﹳ
						 Student stu=new Student();
						 stu.setSnum(rs.getInt("snum"));
						 stu.setSname(rs.getString("sname"));
						 stu.setSage(rs.getInt("sage"));
						 stu.setMoney(rs.getDouble("money"));
						 //�N�ﹳ�s�x��ArrayList��
						 list.add(stu);
					 }
					 return list;
	}
	
	
	
	//�ھڷs���ʺ٭ק�Τ�ʺ�
	public int updateSname(String newName) throws ClassNotFoundException, SQLException{
		//�[���X��
				Class.forName("oracle.jdbc.driver.OracleDriver");
				//�Ыسs���ﹳ
				Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "oracle");
				//�]�m�ưȤ�ʴ���
				conn.setAutoCommit(false);
				//�Ы�sql�R�O�ﹳ
				Statement stmt=conn.createStatement();
				//�Ы�sql�R�O
					String sql="update student set sname='"+newName+"' where snum=6";
				//����sql�R�O
					int i=-1;
					try {
						 i=stmt.executeUpdate(sql);
						conn.commit();
						
					} catch (Exception e) {
						conn.rollback();
					}
				//�����귽
					stmt.close();
					conn.close();
					return i;
	
	} 
}
