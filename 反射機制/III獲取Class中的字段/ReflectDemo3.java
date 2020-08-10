package 反射機制.III獲取Class中的字段;

import java.lang.reflect.Field;

public class ReflectDemo3 {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		getFieldDemo();
		
	}

	/*
	 * 獲取字節碼文件中的字段。
	 */
	public static void getFieldDemo() throws Exception {
		
		Class clazz = Class.forName("反射機制.com.sxt.server.basic.Person");
		
		Field field = null;//clazz.getField("age");//只能獲取公有的，
		
		field = clazz.getDeclaredField("age");//只獲取本類，但包含私有。 
		
		//對私有字段的訪問取消權限檢查。暴力訪問。
		field.setAccessible(true);
		
		Object obj = clazz.newInstance();
		
		field.set(obj, 89);
		
		
		Object o = field.get(obj);
		
		System.out.println(o);
		
//		反射機制.com.sxt.server.basic.Person p = new 反射機制.com.sxt.server.basic.Person();
//		p.age = 30;
		
	}
	
}
