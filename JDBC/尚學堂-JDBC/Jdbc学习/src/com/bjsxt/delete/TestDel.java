package com.bjsxt.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class TestDel {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1 �[���X��
			Class.forName("oracle.jdbc.driver.OracleDriver");
		//2�Ыسs���ﹳ
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@LocalHost:1521:orcl", "scott", "oracle");
		//3�Ы�sql�R�O�ﹳ
			Statement stmt=conn.createStatement();
		//4�Ы�sql�R�O
			String sql="delete from student where snum='2'";
		//5����sql�R�O
			int i=stmt.executeUpdate(sql);
			System.out.println("�R���ƾڶq:"+i);
		//6�����귽
			stmt.close();
			conn.close();
	}
}
