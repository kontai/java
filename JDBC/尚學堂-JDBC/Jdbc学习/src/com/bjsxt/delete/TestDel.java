package com.bjsxt.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class TestDel {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1 加載驅動
			Class.forName("oracle.jdbc.driver.OracleDriver");
		//2創建連接對像
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@LocalHost:1521:orcl", "scott", "oracle");
		//3創建sql命令對像
			Statement stmt=conn.createStatement();
		//4創建sql命令
			String sql="delete from student where snum='2'";
		//5執行sql命令
			int i=stmt.executeUpdate(sql);
			System.out.println("刪除數據量:"+i);
		//6關閉資源
			stmt.close();
			conn.close();
	}
}
