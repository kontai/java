package IO流.XIX_編碼與解碼;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class LianTong {

	/**
	 * @param args
	 * @throws IOException 
	 */

	
	public static void main(String[] args) throws IOException {
		
		String str = "聯通";
		/*
		11000001
		10101010
		11001101
		10101000
		*/

		
		byte[] buf = str.getBytes("gbk");
		
		for(byte b :buf){
			System.out.println(Integer.toBinaryString(b&255));
		}

		String s1=new String(buf,"utf-8");
		System.out.println(s1);

	}

	
}
