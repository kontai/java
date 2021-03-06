package 網路編程.III_TCP.上傳文本文件;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class UploadClient {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {

		System.out.println("上傳客戶端。。。。。。");
		
		File file = new File("c:\\client.txt");
		System.out.println(file.exists());
		
		
		//1
		Socket s = new Socket("192.168.1.100",10005);
		
		//2
		BufferedReader bufr =
				new BufferedReader(new FileReader(file));
		
		//3,
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		
		
		String line = null;
		while((line=bufr.readLine())!=null){
			
			out.println(line);
		}
		
		//告訴服務端，客戶端寫完了。
		s.shutdownOutput();
//		out.println("!@#$%^&*(");
		
		//4,
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String str = bufIn.readLine();
		System.out.println(str);
		
		bufr.close();
		s.close();
		
	}

}
