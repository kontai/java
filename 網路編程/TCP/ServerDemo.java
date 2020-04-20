package 網路編程.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
//		服務端接收客戶端發送過來的數據，並打印在控制台上。 
		/*
		 * 建立tcp服務端的思路：
		 * 1，創建服務端socket服務。通過ServerSocket對象。
		 * 2，服務端必須對外提供一個端口，否則客戶端無法連接。
		 * 3，獲取連接過來的客戶端對象。
		 * 4，通過客戶端對像獲取socket流讀取客戶端發來的數據 
		 * 		並打印在控制台上。
		 * 5，關閉資源。關客戶端，關服務端。 
		 */
		
		//1創建服務端對象。
		ServerSocket ss = new ServerSocket(10002);
		
		//2,獲取連接過來的客戶端對象。
		Socket s = ss.accept();//阻塞式.
		
		String ip = s.getInetAddress().getHostAddress();
		
		//3，通過socket對像獲取輸入流，要讀取客戶端發來的數據
		InputStream in = s.getInputStream();
		
		byte[] buf = new byte[1024];
		
		int len = in.read(buf);
		String text = new String(buf,0,len);
		System.out.println(ip+":"+text);
		
		
		
		
		
				
		s.close();
		ss.close();
		
	}

}
