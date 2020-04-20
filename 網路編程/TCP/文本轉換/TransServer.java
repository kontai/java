package 網路編程.TCP.文本轉換;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TransServer {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		/*
		 * 
		 * 轉換服務端。
		 * 分析：
		 * 1，serversocket服務。
		 * 2，獲取socket對象。
		 * 3，源：socket，讀取客戶端發過來的需要轉換的數據。
		 * 4，目的：顯示在控制台上。
		 * 5，將數據轉成大寫發給客戶端。 
		 */
		
		//1,
		ServerSocket ss = new ServerSocket(10004);
		
		//2,獲取socket對象。
		Socket s = ss.accept();
		
		//獲取ip.
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip+"......connected");
		
		//3,獲取socket讀取流，並裝飾。 
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		//4,獲取socket的輸出流，並裝飾。
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		
		String line = null;
		while((line=bufIn.readLine())!=null){
			
			System.out.println(line);
			out.println(line.toUpperCase());
//			out.print(line.toUpperCase()+"\r\n");
//			out.flush();
		}
		
		s.close();
		ss.close();
		
	}

}
