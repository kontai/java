package IO流.VI_InputSteam由鍵盤讀入;

import java.io.IOException;
import java.io.InputStream;



/*
 * 讀取一個鍵盤錄入的數據，並打印在控制台上。
 * 
 * 鍵盤本身就是一個標準的輸入設備。
 * 對於java而言，對於這種輸入設備都有對應的對象。
 * 
 * 
 */
public class ReadKey {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

//		readKey();
//		System.out.println((int)'\r');
//		System.out.println((int)'\n');
		
		readKey2();
		
	}

	public static void readKey2() throws IOException {
		
		/*
		 * 獲取用戶鍵盤錄入的數據，
		 * 並將數據變成大寫顯示在控制台上，
		 * 如果用戶輸入的是over，結束鍵盤錄入。
		 * 
		 * 思路：
		 * 1，因為鍵盤錄入只讀取一個字節，要判斷是否是over，需要將讀取到的字節拼成字符串。
		 * 2，那就需要一個容器。StringBuilder.
		 * 3，在用戶回車之前將錄入的數據變成字符串判斷即可。 
		 * 
		 */
		
		//1，創建容器。
		StringBuilder sb = new StringBuilder();
		
		//2，獲取鍵盤讀取流。		
		InputStream in = System.in;
		
		//3，定義變量記錄讀取到的字節，並循環獲取。 		
		int ch = 0;
		
		while((ch=in.read())!=-1){
			
//			在存儲之前需要判斷是否是換行標記 ,因為換行標記不存儲。 
			if(ch=='\r')
				continue;
			if(ch=='\n'){
				String temp = sb.toString();
				if("over".equals(temp))
					break;
				System.out.println(temp.toUpperCase());
				sb.delete(0, sb.length());
			}
			else
			//將讀取到的字節存儲到StringBuilder中。
			sb.append((char)ch);
			
//			System.out.println(ch);
		}
		
	}

	public static void readKey() throws IOException {
		
		InputStream in = System.in;
		
		int ch = in.read();//阻塞式方法。		
		System.out.println(ch);
		int ch1 = in.read();//阻塞式方法。		
		System.out.println(ch1);
		int ch2 = in.read();//阻塞式方法。		
		System.out.println(ch2);
		
//		in.close();
		
//		InputStream in2 = System.in;
//		int ch3 = in2.read();
		
	}
	

}
