package com.bjsxt.dao;

import java.util.ArrayList;
import java.util.Date;

import com.bjsxt.pojo.Emp;

public interface EmpDao {
	//�d�ߩҦ����u�H��
		public ArrayList<Emp> selAllEmpInfo();
	//�ھڽs���d�߭��u�H��
		public Emp selEmpInfoByEmpno(int empno);
	//�K�[���u�H��
		public int insEmpInfo(int empno,String ename,String job,int mgr,Date hiredate,double sal,double comm,int deptno);
	//�ק���u�m�W
		public int upEmp(String newName,int empno);
	//�R�����u�H��	
		public int delEmp(int empno);
	
}
