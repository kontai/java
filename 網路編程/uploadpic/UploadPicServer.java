package 網路編程.uploadpic;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadPicServer {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
			
		//創建tcp的socket服務端。
		ServerSocket ss = new ServerSocket(10006);
		
		while(true){
			Socket s = ss.accept();			
			
			new Thread(new UploadTask(s)).start();		
			
		}
		//獲取客戶端。
		
		
//		ss.close();
		
		
	}

}
