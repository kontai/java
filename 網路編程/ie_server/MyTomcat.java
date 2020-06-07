package 網路編程.ie_server;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyTomcat {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		ServerSocket ss = new ServerSocket(9090);
		
		Socket s = ss.accept();
		System.out.println(s.getInetAddress().getHostAddress()+".....connected");
		
		InputStream in = s.getInputStream();
		
		byte[] buf = new byte[1024];
		
		int len = in.read(buf);
		String text = new String(buf,0,len);
		System.out.println(text);
		
		
		//給客戶端一個反饋信息。
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		
		out.println("<font color='red' size='7'>歡迎光臨</font>");
		
		s.close();
		ss.close();
	}

}
