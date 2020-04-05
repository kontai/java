package IO流.XIX_編碼與解碼;

import java.io.IOException;


public class Test {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		String str = "ab你好cd謝謝";
//		str = "ab琲琲cd琲琲";
		
//		int len = str.getBytes("gbk").length;		
//		for(int x=0; x<len; x++){
//			System.out.println("截取"+(x+1)+"個字節結果是："+cutStringByByte(str, x+1));
//		}
		
		int len = str.getBytes("utf-8").length;		
		for(int x=0; x<len; x++){
			System.out.println("截取"+(x+1)+"個字節結果是："+cutStringByU8Byte(str, x+1));
		}
		
		
		
//		String str = "琲";
//		byte[] buf = str.getBytes("gbk");
//		for(byte b : buf){
//			System.out.println(b);//-84  105 
//		}
			
	}
	
	/*
	  	在java中，字符串「abcd」與字符串「ab你好」的長度是一樣，都是四個字符。
		但對應的字節數不同，一個漢字佔兩個字節。
		定義一個方法，按照最大的字節數來取子串。
		如：對於「ab你好」，如果取三個字節，那麼子串就是ab與「你」字的半個，
		那麼半個就要捨棄。如果去四個字節就是「ab你」，取五個字節還是「ab你」.
		
		
	 */
	
	public static String cutStringByU8Byte(String str, int len) throws IOException {
		
		byte[] buf = str.getBytes("utf-8");
		
		int count = 0;
		for(int x=len-1; x>=0; x--){
			if(buf[x]<0)
				count++;
			else
				break;
		}
		
		if(count%3==0)
			return new String(buf,0,len,"utf-8");
		else if(count%3==1)
			return new String(buf,0,len-1,"utf-8");
		else 
			return new String(buf,0,len-2,"utf-8");
		
	}

	public static String cutStringByByte(String str,int len) throws IOException{
		
		byte[] buf = str.getBytes("gbk");
		
		int count = 0;
		for(int x=len-1; x>=0; x--){
			if(buf[x]<0)
				count++;
			else
				break;
		}
		
		if(count%2==0)
			return new String(buf,0,len,"gbk");
		else
			return new String(buf,0,len-1,"gbk");
	}
}










