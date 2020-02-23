package 集合框架.VI_JDK5新增功能.動態導入;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static java.util.Collections.*;//靜態導入，其實到入的是類中的靜態成員。
//import static java.util.Collections.max;//靜態導入，其實到入的是類中的靜態成員。

import static java.lang.System.*;

public class StaticImportDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		
		list.add("abc3");
		list.add("abc7");
		list.add("abc1");
		
		out.println(list);
		
		sort(list);
		
		System.out.println(list);
		
		
		String max = max(list);
		System.out.println("max="+max);
		
	}

}
