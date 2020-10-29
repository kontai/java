package com.bjsxt.practice;

import java.sql.SQLException;
import java.util.Scanner;

import com.bjsxt.daoImpl.StudentDaoImpl;

/**
 * 需求:
 * 		更新用戶暱稱,使用控制台獲取新的用戶暱稱,跟新成功後提示更新成功.
 * 分析:
 * 		java+jdbc
 * 使用:
 * 		創建java類
 * 		創建main方法
 * 		創建Scanner對像獲取控制台數據
 * 		使用JDBC將數據更新到數據庫中
 * 		提示更新成功
 * 問題:
 * 		不同的用戶數據使用相同的數據庫操作.
 * 解決:
 * 	  	將數據操作代碼單獨進行封裝.
 * 優點:
 * 	   	避免代碼的冗余
 * 封裝:
 * 		
 * @author MyPC
 *
 */
public class UpdateName {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//創建Scanner對像
		Scanner sc=new Scanner(System.in);
		System.out.println("請輸入新的暱稱:");
		String newName=sc.nextLine();
		//調用Dao層對數據庫進行操作
		StudentDaoImpl sd=new StudentDaoImpl();
		int i=sd.updateSname(newName);
		//判斷
		if(i>0){
			System.out.println("更改成功");
		}else{
			System.out.println("更改失敗");
		}
		
	}	
}
