package com.bjsxt.practice;

import java.sql.SQLException;
import java.util.Scanner;

import com.bjsxt.daoImpl.StudentDaoImpl;

/**
 * �ݨD:
 * 		��s�Τ�ʺ�,�ϥα���x����s���Τ�ʺ�,��s���\�ᴣ�ܧ�s���\.
 * ���R:
 * 		java+jdbc
 * �ϥ�:
 * 		�Ы�java��
 * 		�Ы�main��k
 * 		�Ы�Scanner�ﹳ�������x�ƾ�
 * 		�ϥ�JDBC�N�ƾڧ�s��ƾڮw��
 * 		���ܧ�s���\
 * ���D:
 * 		���P���Τ�ƾڨϥάۦP���ƾڮw�ާ@.
 * �ѨM:
 * 	  	�N�ƾھާ@�N�X��W�i��ʸ�.
 * �u�I:
 * 	   	�קK�N�X�����E
 * �ʸ�:
 * 		
 * @author MyPC
 *
 */
public class UpdateName {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//�Ы�Scanner�ﹳ
		Scanner sc=new Scanner(System.in);
		System.out.println("�п�J�s���ʺ�:");
		String newName=sc.nextLine();
		//�ե�Dao�h��ƾڮw�i��ާ@
		StudentDaoImpl sd=new StudentDaoImpl();
		int i=sd.updateSname(newName);
		//�P�_
		if(i>0){
			System.out.println("��令�\");
		}else{
			System.out.println("��異��");
		}
		
	}	
}
