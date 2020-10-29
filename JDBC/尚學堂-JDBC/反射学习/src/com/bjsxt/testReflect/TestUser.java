package com.bjsxt.testReflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.bjsxt.pojo.User;

public class TestUser {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		//傳統方式
			operTr();
		System.out.println("********************************");
		//反射方式
			operReflect();
	}
	private static void operReflect() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		//獲取類對像
		Class cla=Class.forName("com.bjsxt.pojo.User");
		//獲取實例化對像
		Object obj=cla.newInstance();
		//給屬性賦值,調用方法
		Method m=cla.getDeclaredMethod("setUname", String.class);
		Method m2=cla.getDeclaredMethod("setUfav", String.class);
		m.invoke(obj, "張三");
		m2.invoke(obj, "寫代碼");
		//調用方法
		Method m3=cla.getDeclaredMethod("getUname",null);
		Method m4=cla.getDeclaredMethod("getUfav", null);
		System.out.println(m3.invoke(obj, null)+":"+m4.invoke(obj, null));
		Method m5=cla.getDeclaredMethod("operFav", String.class);
		m5.invoke(obj,m4.invoke(obj, null));
		
	}
	//傳統方式
	private static void operTr() {
		User u=new User();
		u.setUname("張三");
		u.setUfav("寫代碼");
		System.out.println(u.getUname()+":"+u.getUfav());
		u.operFav(u.getUfav());
	}
}
