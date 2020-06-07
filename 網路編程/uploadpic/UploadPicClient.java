package 網路編程.uploadpic;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class UploadPicClient {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {

		
		//1,創建客戶端socket。
		Socket s = new Socket("192.168.1.100",10006);
		
		//2,讀取客戶端要上傳的圖片文件。
		FileInputStream fis = new FileInputStream("c:\\0.bmp");
		
		//3,獲取socket輸出流，將讀到圖片數據發送給服務端。
		OutputStream out = s.getOutputStream();
		
		byte[] buf = new byte[1024];
		
		int len = 0;
		
		while((len=fis.read(buf))!=-1){
			out.write(buf,0,len);
		}
		
		//告訴服務端說：這邊的數據發送完畢。讓服務端停止讀取。
		s.shutdownOutput();
		
		
		//讀取服務端發回的內容。 		
		InputStream in  = s.getInputStream();
		byte[] bufIn = new byte[1024];
		
		int lenIn = in.read(buf);
		String text = new String(buf,0,lenIn);
		System.out.println(text);
		
		fis.close();
		s.close();
		
		
		
		
	}

}
