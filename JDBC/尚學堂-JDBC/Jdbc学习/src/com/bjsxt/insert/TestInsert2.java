package com.bjsxt.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * jdbc新增學習:
 * 		1	導入jdbc驅動包
 *		聲明JDBC變量
 *		聲明JDBC參數			
 * 		2 	加載驅動
 * 		3 	常見數據庫連接
 * 		4 	創建數據庫命令對像
 * 		5	創建sql命令
 * 		6	執行sql
 * 		7 	關閉資源
 * 常見的jdbc錯誤:
 * 		a ClassNotFoundException:
 * 				驅動類未找到.
 * 		b   java.sql.SQLException: No suitable driver found for :thin:@localhost:1521:orcl
 * 				URL錯誤
 * 		c	java.sql.SQLException: ORA-01017: invalid username/password; logon denied
 * 				用戶 名或密碼錯誤
 * 		d	java.sql.SQLSyntaxErrorException: ORA-00900: 無效 SQL 語句
 * 				Sql語句錯誤
 * 		e	java.sql.SQLIntegrityConstraintViolationException: ORA-00001: 違反唯一約束條件 (SCOTT.PK_DEPT)
 * 				主鍵衝突
 */
public class TestInsert2 {
	public static void main(String[] args){
		//聲明jdbc變量
		Connection conn=null;
		Statement stmt=null;
		//聲明JDBC參數
			String driver="oracle.jdbc.driver.OracleDriver";
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			String username="scott";
			String password="oracle";
		//1 加載驅動類
		try {
			Class.forName(driver);
			//2 獲取數據庫連接對像(連接指定的數據庫)
			conn=DriverManager.getConnection(url,username,password);
			//3 獲取sql命令對像(編譯和發送sql命令給數據庫)
			stmt=conn.createStatement();
			//4 創建sql命令
			String sql="insert into dept values(97,'吃雞學院','北京')";
			//5 指定sql命令
			int i=stmt.executeUpdate(sql);
			System.out.println("執行結果:"+i);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//6 關閉資源
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




























