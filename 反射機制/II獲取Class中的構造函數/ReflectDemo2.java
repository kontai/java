package 反射機制.II獲取Class中的構造函數;

import java.io.FileReader;
import java.lang.reflect.Constructor;

public class ReflectDemo2 {

	/**
	 * @param args
	 * @throws Exception 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, Exception {

		createNewObject_2();
		
	}
	
	public static void createNewObject_2() throws Exception {
		
//		反射機制.com.sxt.server.basic.Person p = new 反射機制.com.sxt.server.basic.Person("小強",39);
		
		/*
		 * 當獲取指定名稱對應類中的所體現的對象時，
		 * 而該對像初始化不使用空參數構造該怎麼辦呢？
		 * 既然是通過指定的構造 函數進行對象的初始化，
		 * 所以應該先獲取到該構造函數。 通過字節碼文件對像即可完成。
		 * 該方法是：getConstructor(paramterTypes);
		 * 
		 */
		String name = "反射機制.com.sxt.server.basic.Person";
		//找尋該名稱類文件，並加載進內存，並產生Class對象。
		Class clazz = Class.forName(name);
		//獲取到了指定的構造函數對  象。
		Constructor constructor = clazz.getConstructor(String.class,int.class);
		
		//通過該構造器對象的newInstance方法進行對象的初始化。
		Object obj = constructor.newInstance("小明",38);
		
			
		
	}

	public static void createNewObject() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		
		//早期：new時候，先根據被new的類的名稱找尋該類的字節碼文件，並加載進內存，
//		並創建該字節碼文件對象，並接著創建該字節文件的對應的Person對像.
//		反射機制.com.sxt.server.basic.Person p = new 反射機制.com.sxt.server.basic.Person();
		
		//現在：
		String name = "反射機制.com.sxt.server.basic.Person";
		//找尋該名稱類文件，並加載進內存，並產生Class對象。
		Class clazz = Class.forName(name);
		//如何產生該類的對象呢？
		Object obj  = clazz.newInstance();
		
		
		
		
	}
}
