package 集合框架.IVMap集合.test;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;


/*
 * 練習:
 * "fdgavcbsacdfs" 獲取該字符串中，每一個字母出現的次數。
 * 要求打印結果是：a(2)b(1)...;
 * 思路：
 * 對於結果的分析發現，字母和次數之間存在著映射的關係。而且這種關係很多。
 * 很多就需要存儲，能存儲映射關係的容器有數組和Map集合。
 * 關係一方式有序編號嗎？沒有！
 * 那就是使用Map集合。 又發現可以保證唯一性的一方具備著順序如 a b c ...
 * 所以可以使用TreeMap集合。
 * 
 * 這個集合最終應該存儲的是字母和次數的對應關係。 
 * 
 * 1，因為操作的是字符串中的字母，所以先將字符串變成字符數組。
 * 2，遍歷字符數組，用每一個字母作為鍵去查Map集合這個表。
 * 如果該字母鍵不存在，就將該字母作為鍵 1作為值存儲到map集合中。
 * 如果該字母鍵存在，就將該字母鍵對應值取出並+1，在將該字母和+1後的值存儲到map集合中，
 * 鍵相同值會覆蓋。這樣就記錄住了該字母的次數.
 * 3，遍歷結束，map集合就記錄所有字母的出現的次數。oy.
 * 
 * 
 */

public class MapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		String str = "fdg+avAdc  bs5dDa9c-dfs";
		
		String s = getCharCount(str);
		
		System.out.println(s);
		
	}

	public static String getCharCount(String str) {
		
		
		//將字符串變成字符數組 
		char[] chs = str.toCharArray();
		
		//定義map集合表。
		Map<Character,Integer> map = new TreeMap<Character,Integer>();
		
		for (int i = 0; i < chs.length; i++) {
			
			if(!(chs[i]>='a' && chs[i]<='z' || chs[i]>='A' && chs[i]<='Z'))
//			if(!(Character.toLowerCase(chs[i])>='a' && Character.toLowerCase(chs[i])<='z'))
				continue;
			
			//將數組中的字母作為鍵去查map表。			
			Integer value = map.get(chs[i]);
			
			int count = 1;
			
			//判斷值是否為null.
			if(value!=null){
				count = value+1;
			}
//			count++;
			map.put(chs[i], count);
			/*
			if(value==null){
				map.put(chs[i], 1);
			}else{
				map.put(chs[i], value+1);
			}
			*/
		}
		
		
		
		
		
		return mapToString(map);
	}

	private static String mapToString(Map<Character, Integer> map) {
		
		StringBuilder sb = new StringBuilder();
		
		Iterator<Character> it = map.keySet().iterator();
		
		while(it.hasNext()){
			Character key = it.next();
			Integer value = map.get(key);
			
			sb.append(key+"("+value+")");
		}
		
		return sb.toString();
	}

}








