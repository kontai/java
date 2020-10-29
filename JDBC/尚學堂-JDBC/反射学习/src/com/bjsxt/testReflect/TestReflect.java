package com.bjsxt.testReflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.bjsxt.pojo.Person;
import com.bjsxt.pojo.Student;

/**
 * 傳統方式:
 * 		只能靜態的創建java對像
 * 反射的特點:
 * 		實現了java對象的動態創建.
 * 反射的缺點:
 * 		反射的代碼效率低,影響程序性能.
 * 開發使用:
 * 		反射和傳統結合的方式
 * 反射學習:
 * 		獲取類對像
 * 			Class.forName("類的全限定路徑");		創建類對像使用較多
 * 			類名.class							操作反射方法較多
 * 			對像名.getClass()						操作反射方法較多
 * 			注意:
 * 				一個類只有一個類對像
 * 		操作屬性:
 * 			獲取類對像
 * 			獲取類屬性
 * 				getFields()						獲取所有的公共字段包括父類			返回Field[]
 * 				getDeclaredFields()				獲取所有聲明的字段(不包括父類)		返回Field[]
 * 				getField(String name)			獲取指定的公共字段包括父類			返回Field
 * 				getDeclaredField(String name)	獲取指定的聲明的字段(不包括父類)		返回Field
 * 			操作類屬性
 * 				操作靜態屬性
 * 					類屬性對像.get(null) 			返回靜態屬性的值
 * 					類屬性對像.set(null,"值")		賦值
 * 				操作非靜態屬性
 * 					類屬性對像.get(Object obj);
 * 					類屬性對像.set(Object obj,"值");
 * 		操作方法:
 * 			獲取類對像
 * 			獲取方法對像
 * 				getMethods()								獲取所有的公共方法包括父類
 * 				getDeclaredMethods()						獲取所有聲明的方法不包括父類
 * 				getMethod(String name,Class...cla)			獲取指定的公共方法
 * 						String name  	表示方法名
 * 						Class...cla  	表示方法接收的參數類型的類對像
 * 				getDeclaredMethod(String name,Class...cla)	獲取指定的聲明方法
 * 						String name  	表示方法名
 * 						Class...cla  	表示方法接收的參數類型的類對像
 * 			操作方法
 * 				靜態方法
 * 					方法對像.invoke(null,參數值1,參數值2,....);
 * 					方法對像.invoke(null,null);
 * 				非靜態方法
 * 					Object obj=cla.newInstance();
 * 					方法對像.invoke(obj,參數值1,參數值2,....)
 * 					方法對像.invoke(obj,null)
 * 			操作構造器:
 * 				獲取類對像
 * 				獲取構造器對像
 * 				操作構造器對像
 * @author MyPC
 */
public class TestReflect {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
		//反射操作類屬性 
			//operField();
		//反射操作類方法
			//operMethod();
		//反射操作構造器
			operConstructor();
	}
	//反射操作構造器
	private static void operConstructor() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		//獲取類對像
		Class cla=Class.forName("com.bjsxt.pojo.Student");
		//獲取構造器方法對像
			Constructor[] cs=cla.getConstructors();
			for(Constructor c:cs){
				System.out.println(c.getName());
			}
		//獲取指定的構造器
			Constructor c=cla.getConstructor(String.class);
		//創建實例化對像
			Object obj=	c.newInstance("女");
			System.out.println(cla.getDeclaredMethod("getSsex",null).invoke(obj,null));
			
			Student s=new Student("女");
			System.out.println(s.getSsex());
			
	}
	//操作方法
	private static void operMethod() throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		//獲取類對像
		Class cla=Class.forName("com.bjsxt.pojo.Student");
		//獲取類方法對像
			//獲取所有的公共方法包括父類
			Method[] ms=cla.getMethods();
			for(Method m:ms){
				System.out.println("獲取方法名--->"+m.getName());
			}
			System.out.println("************************************");
			//獲取所有聲明的方法不包括父類
			Method[] ms2=cla.getDeclaredMethods();
			for(Method m:ms2){
				System.out.println("獲取方法名--->"+m.getName());
			}
			//獲取指定的公共方法包括父類
				Method m=cla.getMethod("pHi", int.class,String.class);
				System.out.println(m.getReturnType());
			//獲取指定的聲明的方法,不包括父類
				Method m2=cla.getDeclaredMethod("sHello",null);
				System.out.println(m2.getName());
			//執行方法
				//靜態方法
					Method m3=cla.getDeclaredMethod("sHi",String.class);
					m3.invoke(null, "今天學了反射,好開心");
				//非靜態
					Method m4=cla.getDeclaredMethod("sHi",int.class,String.class);
					m4.invoke(cla.newInstance(), 3,"反射功能好強大");
	}

	public static void operField() throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InstantiationException{
		//獲取類對像
		Class cla=Class.forName("com.bjsxt.pojo.Student");
		//獲取反射類屬性
			//獲取類及其父類的公共字段
				Field[] fds = cla.getFields();
				for(Field f:fds){
					System.out.println("獲取屬性名------>"+f.getName());
					System.out.println("獲取修飾符------>"+f.getModifiers());
					System.out.println("獲取類型------>"+f.getType());//返回的是類型的Class對像
				}
				System.out.println("******************************");
			//獲取類聲明的所有字段
				Field[] fds2=cla.getDeclaredFields();
				for(Field f:fds2){
					System.out.println("獲取屬性名----->"+f.getName());
					System.out.println("獲取修飾符------>"+f.getModifiers());
					System.out.println("獲取類型------>"+f.getType());//返回的是類型的Class對像
				}
				System.out.println("******************************");
			//獲取指定的字段
				Field f=cla.getField("pname");//指定獲取類及其父類的公共字段
				System.out.println(f.getName());
				Field f2=cla.getDeclaredField("money");//指定獲取類的所有字段
				System.out.println(f2.getName());
				Field f3=cla.getSuperclass().getDeclaredField("pname");//指定獲取父類聲明的字段
				System.out.println(f3.getName());
			//操作字段值
				System.out.println("************操作靜態字段**********************");
				//操作靜態屬性
				Field fs=cla.getDeclaredField("money");
				fs.set(null,2000);
				System.out.println(fs.get(null));
				System.out.println("************操作非靜態字段**********************");
				//操作非靜態屬性
				Field fd=cla.getDeclaredField("sname");
				Object obj=cla.newInstance();
				fd.set(obj, "李四");
				System.out.println(fd.get(obj));	
				//暴力反射操作私有化屬性(瞭解)
				Field fd2=cla.getDeclaredField("ssex");
				fd2.setAccessible(true);//暴力反射,操作私有化屬性,不安全
				Object obj2=cla.newInstance();//獲取實例化對像
				System.out.println(fd2.get(obj2));
				
	}
	//反射獲取類對像
	public static void getCla() throws ClassNotFoundException{
				//傳統方式
				Person p=new Person();
				//反射創建類對像
					//第一種方式--->創建類對像
					 Class cla01=Class.forName("com.bjsxt.pojo.Person");
					//第二種方式---->調用底層使用反射封裝的方法
					 Class cla02=Person.class;
					//第三種方式---->調用底層使用反射封裝的方法
					 Class cla03=new Person().getClass();
					 System.out.println(cla01==cla02);
					 
					 System.out.println("獲取類對象的包名---->"+cla01.getPackage());
					 System.out.println("獲取類的修飾符----->"+cla01.getModifiers());
					 System.out.println("獲取類的名稱(全限定)----->"+cla01.getName());
					 System.out.println("獲取類的名稱(類名)----->"+cla01.getSimpleName());
					 System.out.println("獲取類的父類的類對像----->"+cla01.getSuperclass());	
	}
}
//類對像 Student的Class對像 該對像中封存了Student的所有信息
//類的對象	Student的實例化對像 new Student()
//把張三的蛋糕給我   new  ZhangSan().cake
//把蛋糕給我--->李四  Field.get(new Lisi())







