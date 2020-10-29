package com.bjsxt.translation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * JDBC���ưȺ޲z:
 * 		���~��
 * �ܨ�:
 * 		�i�T�����|���1000��.
 * 
 * �`�N:
 * 		JDBC�����ưȬO�۰ʴ��檺.
 * ���D:
 * 		�p�G�b�~�Ȫ��B�z�L�{��,�Y��Sql�y�y���楢��,���O�ƾڤw�g�Q���F.
 * �ѨM:
 * 		�]�mJDBC���ưȬ���ʴ���.
 * 		sql�y�y�����榨�\��A�Τ@����,�u�n�����Ѫ��N�^�u.
 * �ϥ�:
 * 		conn.setAutoCommit(false)//�]�m����ʴ���
 * 		�ϥ�try catch�i��SQL�R�O���檺���`�B�z
 * 			try���O�ϥ�conn.commit() ����ƾ�
 * 			catch���ϥ�conn.rollback()�^�u�ƾ�
 * @author MyPC
 *
 */
public class TestTran {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//�[���X��
			Class.forName("oracle.jdbc.driver.OracleDriver");
		//�Ыسs���ﹳ
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott","oracle");
		//�]�m�ưȬ���ʴ���
			conn.setAutoCommit(false);
		//�Ы�sql�R�O�ﹳ
			Statement stmt=conn.createStatement();
		//�Ы�sql�R�O
			String sql1="update student set money=money-1000 where snum=6";//���
			String sql2="update student set money=money2+1000 where snum=7";//�J��
		//����sql�R�O
			try {
				int i1=stmt.executeUpdate(sql1);
				int i2=stmt.executeUpdate(sql2);
				System.out.println(i1+"----"+i2);
				conn.commit();
			} catch (Exception e) {
				conn.rollback();//�ƾڦ^�u
			}
		//�����귽
			stmt.close();
		    conn.close();
		
		
	}
}