package 反射機制.I獲取class的三種方式;



/*
 * JAVA反射機制是在運行狀態中，對於任意一個類 (class文件)，都能夠知道這個類的所有屬性和方法；
 * 對於任意一個對象，都能夠調用它的任意一個方法和屬性；
 * 這種動態獲取的信息以及動態調用對象的方法的功能稱為java語言的反射機制。 
 * 
 * 
 * 動態獲取類中信息，就是java反射 。
 * 可以理解為對類的解剖。
 * 
 * 
 * 要想要對字節碼文件進行解剖，必須要有字節碼文件對像.
 * 如何獲取字節碼文件對象呢？
 * 
 */

import 反射機制.Person;

public class ReflectDemo {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
			
		getClassObject_3();
	
	}
	/*
	 * 方式三：
	 * 只要通過給定的類的 字符串名稱就可以獲取該類，更為擴展。
	 * 可是用Class類中的方法完成。
	 * 該方法就是forName.
	 * 這種方式只要有名稱即可，更為方便，擴展性更強。 
	 */
	
	public static void getClassObject_3() throws ClassNotFoundException {
		
		String className = "反射機制.com.sxt.server.basic.Person";
		
		Class clazz = Class.forName(className);
		
		System.out.println(clazz);
	}
	
	



	/*
	 * 方式二：
	 * 2，任何數據類型都具備一個靜態的屬性.class來獲取其對應的Class對象。
	 * 相對簡單，但是還是要明確用到類中的靜態成員。
	 * 還是不夠擴展。 
	 * 
	 */
	public static void getClassObject_2() {
		
		Class clazz = Person.class;
		
		Class clazz1 = Person.class;
		System.out.println(clazz==clazz1);
	}
	
	/*
	 * 獲取字節碼對象的方式：
	 * 1，Object類中的getClass()方法的。
	 * 想要用這種方式，必須要明確具體的類，並創建對象。
	 * 麻煩 .
	 * 
	 */
	public static void getClassObject_1(){
		
		Person p = new Person();
		Class clazz = p.getClass();
		
		Person p1 = new Person();
		Class clazz1 = p1.getClass();
		
		System.out.println(clazz==clazz1);
	}
}
