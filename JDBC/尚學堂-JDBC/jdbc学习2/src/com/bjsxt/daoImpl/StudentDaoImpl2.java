package com.bjsxt.daoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.bjsxt.pojo.Student;
/**
 * ��}�o�ݨD�����[�M�g�OSQL�y�y.
 * �}�o�B�J:
 * 		�~�ȻݨD���R
 * 		�ƾڮw�]�p
 * 		sql�y�y�]�p
 * 		�ƾڮw�ާ@�\������{
 * 		�~���޿�N�X��{
 * 		�p�X����
 * 		�W�u����
 * 		���@
 * ----------------------------------
 * ���W�[�R���M�קﰣ�FSql�y�y���n�����@�P�H�~,��L�n���򥻤@�P.
 * �ʸ˪���Q:
 * 		�ۦP���O�d,���P���ǰ�.
 * 
 * ----------------------------------
 * �ϥ�Statement�ﹳ�����W�[�R���ק�
 * @author MyPC
 *
 */
public class StudentDaoImpl2 {

	//�W�[
		public int insStu(String sname,int sage,double money) throws ClassNotFoundException, SQLException{
			//�[���X��
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//�Ыسs���ﹳ
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "oracle");
			//�Ы�sql�R�O�ﹳ
			Statement stmt=conn.createStatement();
			//�Ы�sql�R�O
			String sql="insert into student values(stu_seq.nextval,'"+sname+"','"+sage+"','"+money+"')";
			//����sql�R�O
			int i=stmt.executeUpdate(sql);
			//�����귽
			stmt.close();
			conn.close();
			return i;
		}
	//�R��
		public int delStu(int snum) throws ClassNotFoundException, SQLException{
			//�[���X��
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//����s���ﹳ
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "oracle");
			//���sql�R�O�ﹳ
			Statement stmt=conn.createStatement();
			//�Ы�sql�R�O
			String sql="delete from student where snum="+snum;
			//����sql�R�O
			int i=stmt.executeUpdate(sql);
			//�����귽
			stmt.close();
			conn.close();
			return i;
		}
	//�ק�
		public int upStu(int snum,String newName) throws ClassNotFoundException, SQLException{
			//�[���X��
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//����s���ﹳ
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "oracle");
			//���sql�R�O�ﹳ
			Statement stmt=conn.createStatement();
			//�Ы�sql�R�O
			String sql="update student set sname='"+newName+"' where snum="+snum;
			//����sql�R�O
			int i=stmt.executeUpdate(sql);
			//�����귽
			stmt.close();
			conn.close();
			return i;	
		}
	//�d��
		public ArrayList<Student> getStudentInfo() throws ClassNotFoundException, SQLException{
			//�n�����X�ﹳ
			ArrayList<Student> ls=new ArrayList<>();
			//�[���X��
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//����s���ﹳ
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "oracle");
			//���sql�R�O�ﹳ
			Statement stmt=conn.createStatement();
			//�Ы�sql�R�O
			String sql="select * from student";
			//����sql�R�O
			ResultSet rs=stmt.executeQuery(sql);
			//�M�����G
			while(rs.next()){
				Student s=new Student();
				s.setSnum(rs.getInt("snum"));
				s.setSname(rs.getString("sname"));
				s.setSage(rs.getInt("sage"));
				s.setMoney(rs.getDouble("money"));
				ls.add(s);
			}
			//�����귽
			rs.close();
			stmt.close();
			conn.close();
			return ls;
		}
			
	
}
