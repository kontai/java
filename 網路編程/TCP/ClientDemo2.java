package 網路編程.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo2 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		//客戶端發數據到服務端
		/*
		 * Tcp傳輸，客戶端建立的過程。
		 * 1，創建tcp客戶端socket服務。使用的是Socket對象。
		 * 		建議該對像一創建就明確目的地。要連接的主機。 
		 * 2，如果連接建立成功，說明數據傳輸通道已建立。
		 * 		該通道就是socket流 ,是底層建立好的。 既然是流，說明這裡既有輸入，又有輸出。
		 * 		想要輸入或者輸出流對象，可以找Socket來獲取。 
		 * 		可以通過getOutputStream(),和getInputStream()來獲取兩個字節流。
		 * 3，使用輸出流，將數據寫出。 
		 * 4，關閉資源。 
		 */
		
		
		
		Socket socket = new Socket("192.168.1.100",10002);
		
		
		OutputStream out = socket.getOutputStream();	
		
		
		out.write("tcp演示：哥們又來了!".getBytes());
		
		
		
		//讀取服務端返回的數據,使用socket讀取流。 
		InputStream in = socket.getInputStream();
		byte[] buf = new byte[1024];
		
		int len = in.read(buf);
		
		String  text = new String(buf,0,len);
		
		System.out.println(text);
		
		
		
		//關閉資源。
		socket.close();
		
		
		
		
		
		
	}

}
