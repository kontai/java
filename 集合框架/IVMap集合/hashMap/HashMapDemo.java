package 集合框架.IVMap集合.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import 集合框架.III泛型.III_自定義泛型.I泛型類.Student;

public class HashMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		/*
		 * 將學生對像和學生的歸屬地通過鍵與值存儲到map集合中。
		 * 
		 */
		
		HashMap<Student,String> hm = new HashMap<Student,String>();

		
		hm.put(new Student("lisi",38),"北京");
		hm.put(new Student("zhaoliu",24),"上海");
		hm.put(new Student("xiaoqiang",31),"瀋陽");
		hm.put(new Student("wangcai",28),"大連");
		hm.put(new Student("zhaoliu",24),"鐵嶺");
		
//		Set<Student> keySet = hm.keySet();		
//		Iterator<Student> it = keySet.iterator();
		
		Iterator<Student> it = hm.keySet().iterator();
		
		while(it.hasNext()){
			Student key = it.next();
			String value = hm.get(key);
			System.out.println(key.getName()+":"+key.getAge()+"---"+value);
		}
		
		
	}

}
