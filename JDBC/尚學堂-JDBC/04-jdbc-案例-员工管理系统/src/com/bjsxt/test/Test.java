package com.bjsxt.test;

import java.util.Scanner;

import com.bjsxt.service.EmpService;
import com.bjsxt.serviceImpl.EmpServiceImpl;

public class Test {
	public static void main(String[] args) {
		//�Ыط~�ȼh�ﹳ
		EmpService es=new EmpServiceImpl();
		do{
			System.out.println("******�w��X�ݭ��u�޲z�t��:�п�ܪA��****************");
			System.out.println("1.�d�ߩҦ����u�H��");
			System.out.println("2.�ھڽs���d�߭��u�H��");
			System.out.println("3.�s�W���u�H��");
			System.out.println("4.�ק���u�m�W");
			System.out.println("5.�R�����u�H��");
			System.out.println("6.�h�X�t��");
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
				System.out.println("���¨ϥ�");
				return;
			default:
				System.out.println("��J���~,�Э��s���");
				break;
			}
		}while(true);
	}
	
}
