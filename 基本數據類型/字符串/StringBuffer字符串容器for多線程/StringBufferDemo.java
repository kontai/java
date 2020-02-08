package 基本數據類型.字符串.StringBuffer字符串容器for多線程;

public class StringBufferDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * StringBuffer:就是字符串緩衝區。
		 * 用於存儲數據的容器。
		 * 特點：
		 * 1，長度的可變的。 
		 * 2，可以存儲不同類型數據。
		 * 3，最終要轉成字符串進行使用。
		 * 4，可以對字符串進行修改。
		 * 
		 * 
		 * 既然是一個容器對象。應該具備什麼功能呢？
		 * 1，添加：
		 * 		StringBuffer append(data);
		 * 		StringBuffer insert(index,data);
		 * 2，刪除：
		 * 		StringBuffer delete(start,end):包含頭，不包含尾。
		 * 		StringBuffer deleteCharAt(int index):刪除指定位置的元素 
		 * 3，查找：
		 * 		char charAt(index);
		 * 		int indexOf(string);
		 * 		int lastIndexOf(string);
		 * 4，修改：
		 * 		StringBuffer replace(start,end,string);
		 * 		void setCharAt(index,char);
		 * 
		 * 增刪改查  C(create)U(update)R(read)D(delete) 
		 * 
		 * 
		 * 
		 */
		bufferMethodDemo_2();
	}
	
	private static void bufferMethodDemo_2() {
		StringBuffer sb = new StringBuffer("abce");
		
//		sb.delete(1, 3);//ae
		
		//清空緩衝區。
//		sb.delete(0,sb.length());
//		sb = new StringBuffer();
		
//		sb.replace(1, 3, "nba");
//		sb.setCharAt(2, 'q');
		
//		sb.setLength(10);
		
//		System.out.println("sb:"+sb);
//		System.out.println("len:"+sb.length());
		
		System.out.println(sb.reverse());
		
		
	}

	private static void bufferMethodDemo_1() {
		StringBuffer sb = new StringBuffer("abce");
		
//		sb.append("xixi");
		sb.insert(2, "qq");
		
		System.out.println(sb.toString());
	}

	public static void bufferMethodDemo(){
		//創建緩衝區對象。
		StringBuffer sb = new StringBuffer();
		
		sb.append(4).append(false);//.append("haha");
		sb.insert(1, "haha");
//		sb.append(true);
		
		System.out.println(sb);
		
	}
	
	

}
