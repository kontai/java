package 集合框架.IVMap集合.treeMap;

import 集合框架.IVMap集合.hashMap.Student;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;


public class TreeMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TreeMap<Student,String> tm = new TreeMap<Student,String>(new ComparatorByName());
		
		tm.put(new Student("lisi",38),"北京");
		tm.put(new Student("zhaoliu",24),"上海");
		tm.put(new Student("xiaoqiang",31),"瀋陽");
		tm.put(new Student("wangcai",28),"大連");
		tm.put(new Student("zhaoliu",24),"鐵嶺");
		
		
		Iterator<Map.Entry<Student, String>> it = tm.entrySet().iterator();
		
		while(it.hasNext()){
			Map.Entry<Student,String> me = it.next();
			Student key = me.getKey();
			String value = me.getValue();
			
			System.out.println(key.getName()+":"+key.getAge()+"---"+value);
		}
		
	}

}
