package com.bjsxt.test;

import java.sql.SQLException;
import java.util.Scanner;

import com.bjsxt.pojo.User;
import com.bjsxt.preparedStatementImpl.UserDaoImpl;
/**
 * preparedStatement對像完成增加刪除修改查找
 * jdbc的封裝
 * jdbc的MVC思想(員工管理系統)
 * ------------------------------------
 * 問題:
 * 		使用Statement對像進行數據庫操作的時候可能會出現sql注入的風險.
 * 解決:
 * 		使用preparedStatement
 * 使用:
 * 		聲明集合或者實體類對像(可選-查詢)      	聲明集合或者實體類對像(可選-查詢)
 * 		加載驅動							加載驅動
 * 		獲取連接對像						獲取連接對像
 * 										創建sql命令
 * 		獲取SQL命令對像(statement)			獲取SQL命令對像(preparedStatement)
 * 		創建sql命令						給佔位符賦值
 * 		執行sql命令						執行sql命令
 * 		遍歷結果(可選-查詢)					遍歷結果(可選-查詢)		
 * 		關閉資源							關閉資源
 * 		返回結果							返回結果
 * 特點:
 * 		防止sql注入
 * 		提升sql語句的執行效率(preparedStatement有預編譯的過程)	
 * 
 * 
 * 
 * @author MyPC
 *
 */
public class TestPs {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//創建Scanner對像
		Scanner sc=new Scanner(System.in);
		System.out.println("請輸入用戶名:");
		String uname=sc.next();
		System.out.println("請輸入密碼:");
		String upwd=sc.next();
		System.out.println(uname+":"+upwd);
		
		//創建數據庫操作對像
		UserDaoImpl ud=new UserDaoImpl();
		User u=ud.getUserInfo(uname, upwd);
		
		
		
		//判斷返回值
		if(u!=null){
			System.out.println("用戶登錄成功");
		}else{
			System.out.println("用戶名或密碼錯誤,請重新登錄");
		}
		
		
		
		
		
		
	}
}
