package 集合框架.IVMap集合;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		method_2(map);
	}
	
	public static void method_2(Map<Integer,String> map){
		
		map.put(8,"zhaoliu");
		map.put(2,"zhaoliu");
		map.put(7,"xiaoqiang");
		map.put(6,"wangcai");
		
		
		Collection<String> values = map.values();
		
		Iterator<String> it2 = values.iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
		
		
		
		/*
		 * 通過Map轉成set就可以迭代。
		 * 找到了另一個方法。entrySet。
		 * 該方法將鍵和值的映射關係作為對像存儲到了Set集合中，而這個映射關係的類型就是Map.Entry類型(結婚證)
		 * 
		 * 
		 */

		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		
		Iterator<Map.Entry<Integer, String>> it = entrySet.iterator();
		
		while(it.hasNext()){
			Map.Entry<Integer, String> me = it.next();
			Integer key = me.getKey();
			String value = me.getValue();
			System.out.println(key+"::::"+value);
			
		}
		
		
		
		
		
		//取出map中的所有元素。
		//原理，通過keySet方法獲取map中所有的鍵所在的Set集合，在通過Set的迭代器獲取到每一個鍵，
		//在對每一個鍵通過map集合的get方法獲取其對應的值即可。
		/*
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> it = keySet.iterator();
		
		while(it.hasNext()){
			Integer key = it.next();
			String value = map.get(key);
			System.out.println(key+":"+value);
			
		}
		*/
		
		
		
	}
	
	
	
	
	
	
	public static void method(Map<Integer,String> map){//學號和姓名
		
		
		// 添加元素。
		System.out.println(map.put(8, "wangcai"));//null
		System.out.println(map.put(8, "xiaoqiang"));//wangcai 存相同鍵，值會覆蓋。
		map.put(2,"zhangsan");
		map.put(7,"zhaoliu");
		
		
		//刪除。
//		System.out.println("remove:"+map.remove(2));
		
		//判斷。
//		System.out.println("containskey:"+map.containsKey(7));
		
		//獲取。 
		System.out.println("get:"+map.get(6));
		
		
		System.out.println(map);
		
		Outer.Inner.show();
	}
	
}

interface MyMap{
	public static interface MyEntry{//內部接口
		void get();
	}
}

class MyDemo implements MyMap.MyEntry{
	public void get(){}
}

class Outer{
	static class Inner{
		static void show(){}
	}
}





