package com.bjsxt.testReflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.bjsxt.pojo.User;

public class TestUser {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		//�ǲΤ覡
			operTr();
		System.out.println("********************************");
		//�Ϯg�覡
			operReflect();
	}
	private static void operReflect() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		//������ﹳ
		Class cla=Class.forName("com.bjsxt.pojo.User");
		//�����Ҥƹﹳ
		Object obj=cla.newInstance();
		//���ݩʽ��,�եΤ�k
		Method m=cla.getDeclaredMethod("setUname", String.class);
		Method m2=cla.getDeclaredMethod("setUfav", String.class);
		m.invoke(obj, "�i�T");
		m2.invoke(obj, "�g�N�X");
		//�եΤ�k
		Method m3=cla.getDeclaredMethod("getUname",null);
		Method m4=cla.getDeclaredMethod("getUfav", null);
		System.out.println(m3.invoke(obj, null)+":"+m4.invoke(obj, null));
		Method m5=cla.getDeclaredMethod("operFav", String.class);
		m5.invoke(obj,m4.invoke(obj, null));
		
	}
	//�ǲΤ覡
	private static void operTr() {
		User u=new User();
		u.setUname("�i�T");
		u.setUfav("�g�N�X");
		System.out.println(u.getUname()+":"+u.getUfav());
		u.operFav(u.getUfav());
	}
}
