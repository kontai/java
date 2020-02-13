package 集合框架.IIList集合.p2_LinkedList.test;

import java.util.ArrayList;


/*
 * 請使用LinkedList來模擬一個堆棧或者隊列數據結構。
 * 
 * 堆棧：先進後出 First In Last Out  FILO
 * 
 * 隊列：先進先出 First In First Out FIFO
 * 
 * 我們應該描述這樣一個容器，給使用提供一個容器對像完成這兩種結構中的一種。
 */


public class LinkedTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		DuiLie dl = new DuiLie();
		
		dl.myAdd("abc1");
		dl.myAdd("abc2");
		dl.myAdd("abc3");
		dl.myAdd("abc4");
		
		while(!dl.isNull()){
			System.out.println(dl.myGet());
		}
		
		
	}

}
