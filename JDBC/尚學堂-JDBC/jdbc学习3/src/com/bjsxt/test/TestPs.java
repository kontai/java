package com.bjsxt.test;

import java.sql.SQLException;
import java.util.Scanner;

import com.bjsxt.pojo.User;
import com.bjsxt.preparedStatementImpl.UserDaoImpl;
/**
 * preparedStatement�ﹳ�����W�[�R���ק�d��
 * jdbc���ʸ�
 * jdbc��MVC��Q(���u�޲z�t��)
 * ------------------------------------
 * ���D:
 * 		�ϥ�Statement�ﹳ�i��ƾڮw�ާ@���ɭԥi��|�X�{sql�`�J�����I.
 * �ѨM:
 * 		�ϥ�preparedStatement
 * �ϥ�:
 * 		�n�����X�Ϊ̹������ﹳ(�i��-�d��)      	�n�����X�Ϊ̹������ﹳ(�i��-�d��)
 * 		�[���X��							�[���X��
 * 		����s���ﹳ						����s���ﹳ
 * 										�Ы�sql�R�O
 * 		���SQL�R�O�ﹳ(statement)			���SQL�R�O�ﹳ(preparedStatement)
 * 		�Ы�sql�R�O						������Ž��
 * 		����sql�R�O						����sql�R�O
 * 		�M�����G(�i��-�d��)					�M�����G(�i��-�d��)		
 * 		�����귽							�����귽
 * 		��^���G							��^���G
 * �S�I:
 * 		����sql�`�J
 * 		����sql�y�y������Ĳv(preparedStatement���w�sĶ���L�{)	
 * 
 * 
 * 
 * @author MyPC
 *
 */
public class TestPs {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//�Ы�Scanner�ﹳ
		Scanner sc=new Scanner(System.in);
		System.out.println("�п�J�Τ�W:");
		String uname=sc.next();
		System.out.println("�п�J�K�X:");
		String upwd=sc.next();
		System.out.println(uname+":"+upwd);
		
		//�Ыؼƾڮw�ާ@�ﹳ
		UserDaoImpl ud=new UserDaoImpl();
		User u=ud.getUserInfo(uname, upwd);
		
		
		
		//�P�_��^��
		if(u!=null){
			System.out.println("�Τ�n�����\");
		}else{
			System.out.println("�Τ�W�αK�X���~,�Э��s�n��");
		}
		
		
		
		
		
		
	}
}
