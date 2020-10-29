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
	//�n���ƾڮw�h�ﹳ
	EmpDao ed=new EmpDaoImpl();
	//�d�ߥ������u�H��
		public void selAllEmpInfo(){
			
			//�ާ@�ƾڮw
			ArrayList<Emp> list=ed.selAllEmpInfo();
			System.out.println("�Τ�s��\t\t�Τ�W\t\t�u�@�^��\t\t��ɽs��\t\t�J¾���\t\t���~��\t\t����\t\t�����s��");
			//�M��
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
		//�ھڥΤ�s���d�ߥΤ�H��
		public void selEmpInfoByEmpno(){
			//����Τ�ƾ�
				Scanner sc=new Scanner(System.in);
				System.out.println("�п�J�n�d�䪺���u�s��:");
				int empno=sc.nextInt();
				//�ާ@�ƾڮw
				Emp p=ed.selEmpInfoByEmpno(empno);
				if(p!=null){
					System.out.println("�Τ�s��\t�Τ�W\t�u�@�^��\t��ɽs��\t�J¾���\t\t���~��\t����\t�����s��");
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
					System.out.println("�d�L���H");
				}
				
		}
		//�R�����u�H��
		public void delEmpInfo(){
			//����Τ�ƾ�
			Scanner sc=new Scanner(System.in);
			System.out.println("�п�J�n�R�������u�s��:");
			int empno=sc.nextInt();
				//�ާ@�ƾڮw
				int i=ed.delEmp(empno);
			//�P�_���G
				if(i>0){
					System.out.println("�R�����\");
				}else{
					System.out.println("�R������");
				}
		}
		//�s�W���u�H��
		public void insEmpInfo(){
			//����Τ�ƾ�
			Scanner sc=new Scanner(System.in);
			System.out.println("�п�J�s�W�Τ�s��:");
			int empno=sc.nextInt();
			System.out.println("�п�J�s�W�Τ�W:");
			String ename=sc.next();
			System.out.println("�п�J�s�W�Τ�u�@:");
			String job=sc.next();
			System.out.println("�п�J�s�W�Τ��ɽs��:");
			int mgr=sc.nextInt();
			System.out.println("�п�J�J¾���(YYYY-MM-DD):");
			String date=sc.next();
			System.out.println("�п�J�s�W�Τ�u�򥻸�:");
			double sal=sc.nextDouble();
			System.out.println("�п�J�s�W�Τ᪺����:");
			double comm=sc.nextDouble();
			System.out.println("�п�J�s�W�Τ᪺�����s��");
			int deptno =sc.nextInt();
			//�N�r�Ŧ�����������ഫ��Date����
			Date hiredate=null;
			try {
				hiredate = new SimpleDateFormat("yyyy-MM-dd").parse(date);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int i=ed.insEmpInfo(empno, ename, job, mgr, hiredate, sal, comm, deptno);
			//�P�_���G
				if(i>0){
					System.out.println("�W�[���\");
				}else{
					System.out.println("�W�[����");
				}
			
		}
		//��s�Τ�H��
			public void upEmpInfo(){
				//����Τ�ƾ�
				Scanner sc=new Scanner(System.in);
				System.out.println("�п�J�Τ�s��:");
				int empno=sc.nextInt();
				System.out.println("�п�J�s���Τ�W:");
				String newName=sc.next();
			//�եμƾڮw�h�ާ@�ƾڮw
				int i=ed.upEmp(newName, empno);
			//���ܥΤ��s���G
				if(i>0){
					System.out.println("��s���\");
				}else{
					System.out.println("��s����");
				}
			}
}


































