package 網路編程.III_TCP.上傳文本文件;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("上傳服務端。。。。。。。。。");
		
		//1
		ServerSocket ss = new ServerSocket(10005);
		
		//2,
		Socket s = ss.accept();
		
		System.out.println(s.getInetAddress().getHostAddress()+".....connected");
		
		//3,
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		//4,
		BufferedWriter bufw = new BufferedWriter(new FileWriter("c:\\server.txt"));
		
		String line = null;
		
		while((line=bufIn.readLine())!=null){
			
//			if("over".equals(line))
//				break;
			bufw.write(line);
			bufw.newLine();
			bufw.flush();
		}
		
		
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		out.println("上傳成功");
		
		bufw.close();
		
		s.close();
		ss.close();
		
		
	}

}
