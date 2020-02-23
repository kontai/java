package 集合框架.VI_JDK5新增功能.foreach循環;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




public class ForEachDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * foreach語句：
		 * 格式：
		 * for(類型  變量   ：Collection集合|數組)
		 * {
		 * 		
		 * }
		 * 
		 * 傳統for和高級for的區別？
		 * 傳統for可以完成對語句執行很多次，因為可以定義控制循環的增量和條件。
		 * 
		 * 高級for是一種簡化形式。
		 * 它必須有被遍歷的目標。該目標要是數組，要麼是Collection單列集合。
		 * 
		 * 對數數組的遍歷如果僅僅是獲取數組中的元素，可以使用高級for。
		 * 如果要對數組的角標進行操作建議使用傳統for。 
		 *  
		 */
		
		List<String> list =new ArrayList<String>();
		
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		
		for(String s : list){	//簡化書寫。		
			System.out.println(s);			
		}
		
		
		int[] arr = {3,1,5,7,4};
		
		for(int i : arr){
			System.out.println(i);
		}
		
		
		//可以使用高級for遍歷map集合嗎？不能直接用，但是可以將map轉成單列的set，就可以用了。
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(3,"zhagsan");
		map.put(1,"wangyi");
		map.put(7,"wagnwu");
		map.put(4,"zhagsansan");
		
		
		for(Integer key : map.keySet()){
			String value = map.get(key);
			System.out.println(key+"::"+value);
		}
		
		for(Map.Entry<Integer,String> me : map.entrySet()){
			Integer key = me.getKey();
			String value = me.getValue();
			
			System.out.println(key+":"+value);
		}
		
		
//		Iterator<String> it = list.iterator();	
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		
		
	}

}
