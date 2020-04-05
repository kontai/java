package IO流.XIX_編碼與解碼;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class EncodeDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		/*
		 * 字符串 --> 字節數組：編碼。
		 * 字節數組 --> 字符串：解碼。
		 * 
		 * 你好：GBK:  -60 -29 -70 -61
		 * 
		 * 你好: utf-8: -28 -67 -96 -27 -91 -67 
		 * 
		 * 
		 * 如果你編錯了，解不出來。
		 * 如果編對了，解錯了，有可能有救。
		 */
		
		String str = "謝謝";
		
		byte[] buf = str.getBytes("gbk");
		
		String s1 = new String(buf,"UTF-8");
		
		System.out.println("s1="+s1);
		
		
		byte[] buf2 = s1.getBytes("UTF-8");//獲取源字節.
		
		printBytes(buf2);//-17 -65 -67 -17 -65 -67 -17 -65 -67 
					//-17 -65 -67 -17 -65 -67 -17 -65 -67 -17 -65 -67
					//-48 -69 -48 -69 
		String s2 = new String(buf2,"GBK");
		
		System.out.println("s2="+s2);
		
		
//		encodeDemo(str);
		
		
		
	}

	/**
	 * @param str
	 * @throws UnsupportedEncodingException
	 */
	public static void encodeDemo(String str)
			throws UnsupportedEncodingException {
		//編碼；
		byte[] buf = str.getBytes("UTF-8");
		
//		printBytes(buf);
		
		//解碼：
		String s1 = new String(buf,"UTF-8");
		
		System.out.println("s1="+s1);
	}

	private static void printBytes(byte[] buf) {
		for(byte b : buf){
			System.out.print(b +" ");
		}
	}

}
