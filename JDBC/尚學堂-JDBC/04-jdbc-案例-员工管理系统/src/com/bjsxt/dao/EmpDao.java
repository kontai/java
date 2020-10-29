package com.bjsxt.dao;

import java.util.ArrayList;
import java.util.Date;

import com.bjsxt.pojo.Emp;

public interface EmpDao {
	//查詢所有員工信息
		public ArrayList<Emp> selAllEmpInfo();
	//根據編號查詢員工信息
		public Emp selEmpInfoByEmpno(int empno);
	//添加員工信息
		public int insEmpInfo(int empno,String ename,String job,int mgr,Date hiredate,double sal,double comm,int deptno);
	//修改員工姓名
		public int upEmp(String newName,int empno);
	//刪除員工信息	
		public int delEmp(int empno);
	
}
