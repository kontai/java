package com.bjsxt.translation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * JDBC的事務管理:
 * 		轉賬業務
 * 示例:
 * 		張三給李四轉賬1000元.
 * 
 * 注意:
 * 		JDBC中的事務是自動提交的.
 * 問題:
 * 		如果在業務的處理過程中,某條Sql語句執行失敗,但是數據已經被更改了.
 * 解決:
 * 		設置JDBC的事務為手動提交.
 * 		sql語句都執行成功後再統一提交,只要有失敗的就回滾.
 * 使用:
 * 		conn.setAutoCommit(false)//設置為手動提交
 * 		使用try catch進行SQL命令執行的異常處理
 * 			try中是使用conn.commit() 提交數據
 * 			catch中使用conn.rollback()回滾數據
 * @author MyPC
 *
 */
public class TestTran {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//加載驅動
			Class.forName("oracle.jdbc.driver.OracleDriver");
		//創建連接對像
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott","oracle");
		//設置事務為手動提交
			conn.setAutoCommit(false);
		//創建sql命令對像
			Statement stmt=conn.createStatement();
		//創建sql命令
			String sql1="update student set money=money-1000 where snum=6";//轉賬
			String sql2="update student set money=money2+1000 where snum=7";//入賬
		//執行sql命令
			try {
				int i1=stmt.executeUpdate(sql1);
				int i2=stmt.executeUpdate(sql2);
				System.out.println(i1+"----"+i2);
				conn.commit();
			} catch (Exception e) {
				conn.rollback();//數據回滾
			}
		//關閉資源
			stmt.close();
		    conn.close();
		
		
	}
}