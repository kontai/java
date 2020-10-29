package com.bjsxt.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * jdbc新增學習:
 * 		1	導入jdbc驅動包
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
 * @author MyPC
 *
 */
public class TestInsert1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1 加載驅動類
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		//2 獲取數據庫連接對像(連接指定的數據庫)
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","oracle");
		//3 獲取sql命令對像(編譯和發送sql命令給數據庫)
		Statement stmt=conn.createStatement();
		//4 創建sql命令
		String sql="insert into dept values(92,'吃雞學院','北京')";
		//5 指定sql命令
		int i=stmt.executeUpdate(sql);
		System.out.println("執行結果:"+i);
		//6 關閉資源
			stmt.close();
			conn.close();
	}
}




























