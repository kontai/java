package 網路編程.III_TCP.文本轉換;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TransClient {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {

		/*
		 * 思路：
		 * 客戶端：
		 * 1，需要先有socket端點。
		 * 2，客戶端的數據源：鍵盤。
		 * 3，客戶端的目的：socket.
		 * 4，接收服務端的數據，源：socket。
		 * 5，將數據顯示在打印出來：目的：控制台.
		 * 6，在這些流中操作的數據，都是文本數據。
		 * 
		 * 
		 * 轉換客戶端:
		 * 1,創建socket客戶端對象。
		 * 2,獲取鍵盤錄入。
		 * 3，將錄入的信息發送給socket輸出流。
		 */
		
		//1,創建socket客戶端對象。
		Socket s = new Socket("192.168.1.100",10004);
		
		//2，獲取鍵盤錄入。
		BufferedReader bufr  =
				new BufferedReader(new InputStreamReader(System.in));
		
		//3,socket輸出流。
//		new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		
		
		//4,socket輸入流，讀取服務端返回的大寫數據
		BufferedReader bufIn  = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String line = null;
		
		while((line=bufr.readLine())!=null){
			
			if("over".equals(line))
				break;
			
//			out.print(line+"\r\n");
//			out.flush();
			out.println(line);
			
			//讀取服務端發回的一行大寫數。
			String upperStr = bufIn.readLine();
			System.out.println(upperStr);
		}
		
		s.close();
		
	}

}
