package com.bjsxt.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.bjsxt.daoImpl.StudentDaoImpl;
import com.bjsxt.pojo.Student;

/**
 * JDBC���d��:
 * 		�[���X��
 * 		�Ыسs���ﹳ
 * 		�Ы�sql�R�O�ﹳ
 * 		�Ы�sql�R�O
 * 		����sql�R�O
 * 			��^�s�x�F�d�ߨ쪺�ƾڪ���H(ResultSet)
 * 				ResultSet��H�O�����w�i��ƾڦs�x��,�����T�|.
 * 		�����귽
 * ���D:
 * 		�d�ߪ���^�������OResultSet,�O�����w�ɤ߼ƾڦs�x��,���K��ƾڪ��w��ʪ����.
 * �ѨM:
 * 		�N�ƾ��ഫ��ArrayList���i��s�x.
 * �ϥ�:
 * 		�ЫةM���c�ۦP���������i�����ƾڪ��s�x(�@���ƾڴN�O�@�ӹ�Ҥƹﹳ)
 * 		�N�ﹳ�s�x��ArrayList��.
 * �ֳt�����^��:
 * 		alt+shift+L
 * 
 * @author MyPC
 *
 */
public class TestSelect {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
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
		
		System.out.println(list.get(2));
		//�Ы�DaoImpl�h�ﹳ
		StudentDaoImpl sd=new StudentDaoImpl();
		ArrayList<Student> ls=sd.getStudentInfo();
	}
}
