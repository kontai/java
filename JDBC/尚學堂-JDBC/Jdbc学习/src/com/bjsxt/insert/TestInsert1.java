package com.bjsxt.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * jdbc�s�W�ǲ�:
 * 		1	�ɤJjdbc�X�ʥ]
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
 * @author MyPC
 *
 */
public class TestInsert1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1 �[���X����
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		//2 ����ƾڮw�s���ﹳ(�s�����w���ƾڮw)
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","oracle");
		//3 ���sql�R�O�ﹳ(�sĶ�M�o�esql�R�O���ƾڮw)
		Statement stmt=conn.createStatement();
		//4 �Ы�sql�R�O
		String sql="insert into dept values(92,'�Y���ǰ|','�_��')";
		//5 ���wsql�R�O
		int i=stmt.executeUpdate(sql);
		System.out.println("���浲�G:"+i);
		//6 �����귽
			stmt.close();
			conn.close();
	}
}




























