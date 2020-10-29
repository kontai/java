package com.bjsxt.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestUpdate {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1加載驅動
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//2創建連接對像
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott","oracle");
		//3創建sql命令對像
		Statement stmt=conn.createStatement();
		//4創建sql命令
		String sname="張三三";
		String sql="update student set sname='"+sname+"' where snum=2";
		//5執行sql命令
		int i=stmt.executeUpdate(sql);
		System.out.println(i);
		//6關閉資源
		stmt.close();
		conn.close();
		
	}
}