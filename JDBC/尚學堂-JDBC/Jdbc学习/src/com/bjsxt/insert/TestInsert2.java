package com.bjsxt.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * jdbc�s�W�ǲ�:
 * 		1	�ɤJjdbc�X�ʥ]
 *		�n��JDBC�ܶq
 *		�n��JDBC�Ѽ�			
 * 		2 	�[���X��
 * 		3 	�`���ƾڮw�s��
 * 		4 	�Ыؼƾڮw�R�O�ﹳ
 * 		5	�Ы�sql�R�O
 * 		6	����sql
 * 		7 	�����귽
 * �`����jdbc���~:
 * 		a ClassNotFoundException:
 * 				�X���������.
 * 		b   java.sql.SQLException: No suitable driver found for :thin:@localhost:1521:orcl
 * 				URL���~
 * 		c	java.sql.SQLException: ORA-01017: invalid username/password; logon denied
 * 				�Τ� �W�αK�X���~
 * 		d	java.sql.SQLSyntaxErrorException: ORA-00900: �L�� SQL �y�y
 * 				Sql�y�y���~
 * 		e	java.sql.SQLIntegrityConstraintViolationException: ORA-00001: �H�ϰߤ@�������� (SCOTT.PK_DEPT)
 * 				�D��Ĭ�
 */
public class TestInsert2 {
	public static void main(String[] args){
		//�n��jdbc�ܶq
		Connection conn=null;
		Statement stmt=null;
		//�n��JDBC�Ѽ�
			String driver="oracle.jdbc.driver.OracleDriver";
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			String username="scott";
			String password="oracle";
		//1 �[���X����
		try {
			Class.forName(driver);
			//2 ����ƾڮw�s���ﹳ(�s�����w���ƾڮw)
			conn=DriverManager.getConnection(url,username,password);
			//3 ���sql�R�O�ﹳ(�sĶ�M�o�esql�R�O���ƾڮw)
			stmt=conn.createStatement();
			//4 �Ы�sql�R�O
			String sql="insert into dept values(97,'�Y���ǰ|','�_��')";
			//5 ���wsql�R�O
			int i=stmt.executeUpdate(sql);
			System.out.println("���浲�G:"+i);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//6 �����귽
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}




























