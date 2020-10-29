package com.bjsxt.serviceImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.bjsxt.dao.EmpDao;
import com.bjsxt.daoImpl.EmpDaoImpl;
import com.bjsxt.pojo.Emp;
import com.bjsxt.service.EmpService;

public class EmpServiceImpl implements EmpService{
	//聲明數據庫層對像
	EmpDao ed=new EmpDaoImpl();
	//查詢全部員工信息
		public void selAllEmpInfo(){
			
			//操作數據庫
			ArrayList<Emp> list=ed.selAllEmpInfo();
			System.out.println("用戶編號\t\t用戶名\t\t工作崗位\t\t領導編號\t\t入職日期\t\t基本薪資\t\t提成\t\t部門編號");
			//遍歷
			for(int i=0;i<list.size();i++){
				Emp p=list.get(i);
				System.out.print(p.getEmpno());
				System.out.print("\t\t");
				System.out.print(p.getEname());
				System.out.print("\t\t");
				System.out.print(p.getJob());
				System.out.print("\t\t");
				System.out.print(p.getMgr());
				System.out.print("\t\t");
				System.out.print(p.getDate());
				System.out.print("\t\t");
				System.out.print(p.getSal());
				System.out.print("\t\t");
				System.out.print(p.getComm());
				System.out.print("\t\t");
				System.out.print(p.getDeptno());
				System.out.println();
			}
		}
		//根據用戶編號查詢用戶信息
		public void selEmpInfoByEmpno(){
			//獲取用戶數據
				Scanner sc=new Scanner(System.in);
				System.out.println("請輸入要查找的員工編號:");
				int empno=sc.nextInt();
				//操作數據庫
				Emp p=ed.selEmpInfoByEmpno(empno);
				if(p!=null){
					System.out.println("用戶編號\t用戶名\t工作崗位\t領導編號\t入職日期\t\t基本薪資\t提成\t部門編號");
					System.out.print(p.getEmpno());
					System.out.print("\t");
					System.out.print(p.getEname());
					System.out.print("\t");
					System.out.print(p.getJob());
					System.out.print("\t");
					System.out.print(p.getMgr());
					System.out.print("\t");
					System.out.print(p.getDate());
					System.out.print("\t");
					System.out.print(p.getSal());
					System.out.print("\t");
					System.out.print(p.getComm());
					System.out.print("\t");
					System.out.print(p.getDeptno());
				}else{
					System.out.println("查無此人");
				}
				
		}
		//刪除員工信息
		public void delEmpInfo(){
			//獲取用戶數據
			Scanner sc=new Scanner(System.in);
			System.out.println("請輸入要刪除的員工編號:");
			int empno=sc.nextInt();
				//操作數據庫
				int i=ed.delEmp(empno);
			//判斷結果
				if(i>0){
					System.out.println("刪除成功");
				}else{
					System.out.println("刪除失敗");
				}
		}
		//新增員工信息
		public void insEmpInfo(){
			//獲取用戶數據
			Scanner sc=new Scanner(System.in);
			System.out.println("請輸入新增用戶編號:");
			int empno=sc.nextInt();
			System.out.println("請輸入新增用戶名:");
			String ename=sc.next();
			System.out.println("請輸入新增用戶工作:");
			String job=sc.next();
			System.out.println("請輸入新增用戶領導編號:");
			int mgr=sc.nextInt();
			System.out.println("請輸入入職日期(YYYY-MM-DD):");
			String date=sc.next();
			System.out.println("請輸入新增用戶工基本資:");
			double sal=sc.nextDouble();
			System.out.println("請輸入新增用戶的提成:");
			double comm=sc.nextDouble();
			System.out.println("請輸入新增用戶的部門編號");
			int deptno =sc.nextInt();
			//將字符串類型的日期轉換為Date類型
			Date hiredate=null;
			try {
				hiredate = new SimpleDateFormat("yyyy-MM-dd").parse(date);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int i=ed.insEmpInfo(empno, ename, job, mgr, hiredate, sal, comm, deptno);
			//判斷結果
				if(i>0){
					System.out.println("增加成功");
				}else{
					System.out.println("增加失敗");
				}
			
		}
		//更新用戶信息
			public void upEmpInfo(){
				//獲取用戶數據
				Scanner sc=new Scanner(System.in);
				System.out.println("請輸入用戶編號:");
				int empno=sc.nextInt();
				System.out.println("請輸入新的用戶名:");
				String newName=sc.next();
			//調用數據庫層操作數據庫
				int i=ed.upEmp(newName, empno);
			//提示用戶更新結果
				if(i>0){
					System.out.println("更新成功");
				}else{
					System.out.println("更新失敗");
				}
			}
}


































