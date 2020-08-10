package 反射機制.IV獲取Class中的方法;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectDemo4 {

	public ReflectDemo4() {
	}

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {

		getMethodDemo_3();
		
	}
	
	

	public static void getMethodDemo_3() throws Exception {
		
		Class clazz = Class.forName("反射機制.com.sxt.server.basic.Person");
		
		Method method = clazz.getMethod("paramMethod", String.class,int.class);
		
		Object obj = clazz.newInstance();
		
		method.invoke(obj, "小強",89);
		
		
	}

	public static void getMethodDemo_2() throws Exception {
		
		Class clazz = Class.forName("反射機制.com.sxt.server.basic.Person");
		
		Method method = clazz.getMethod("show", null);//獲取空參數一般方法。
		
//		Object obj = clazz.newInstance();
		Constructor constructor = clazz.getConstructor(String.class,int.class);
		Object obj = constructor.newInstance("小明",37);
		
		
		method.invoke(obj, null);
		
		
		
	}

	/*
	 * 獲取指定Class中的所有公共函數。
	 */
	public static void getMethodDemo() throws Exception {
		
		Class clazz = Class.forName("反射機制.com.sxt.server.basic.Person");
		
		Method[] methods  = clazz.getMethods();//獲取的都是公有的方法。 
		methods = clazz.getDeclaredMethods();//只獲取本類中所有方法，包含私有。 
		for(Method method : methods){
			System.out.println(method);
		}
		
		
	}

}
