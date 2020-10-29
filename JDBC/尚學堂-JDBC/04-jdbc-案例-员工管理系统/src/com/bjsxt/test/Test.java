package com.bjsxt.test;

import java.util.Scanner;

import com.bjsxt.service.EmpService;
import com.bjsxt.serviceImpl.EmpServiceImpl;

public class Test {
	public static void main(String[] args) {
		//創建業務層對像
		EmpService es=new EmpServiceImpl();
		do{
			System.out.println("******歡迎訪問員工管理系統:請選擇服務****************");
			System.out.println("1.查詢所有員工信息");
			System.out.println("2.根據編號查詢員工信息");
			System.out.println("3.新增員工信息");
			System.out.println("4.修改員工姓名");
			System.out.println("5.刪除員工信息");
			System.out.println("6.退出系統");
			System.out.println("*********************************************");
			Scanner sc=new Scanner(System.in);
			int ch=sc.nextInt();
			switch (ch) {
			case 1:
				es.selAllEmpInfo();
				break;
			case 2:
				es.selEmpInfoByEmpno();
				break;
			case 3:
				es.insEmpInfo();
				break;
			case 4:
				es.upEmpInfo();
				break;
			case 5:
				es.delEmpInfo();
				break;
			case 6:
				System.out.println("謝謝使用");
				return;
			default:
				System.out.println("輸入有誤,請重新選擇");
				break;
			}
		}while(true);
	}
	
}
