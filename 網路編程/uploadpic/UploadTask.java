package 網路編程.uploadpic;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class UploadTask implements Runnable {

	private static final int SIZE = 1024*1024*2;
	private Socket s;

	public  UploadTask(Socket s) {
		this.s = s;
	}

	@Override
	public void run() {

		int count = 0;
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip + ".....connected");
		
		try{

		// 讀取客戶端發來的數據。
		InputStream in = s.getInputStream();

		// 將讀取到數據存儲到一個文件中。
		File dir = new File("c:\\pic");
		if (!dir.exists()) {
			dir.mkdirs();
		}
		File file = new File(dir, ip + ".jpg");
		//如果文件已經存在於服務端 
		while(file.exists()){
			file = new File(dir,ip+"("+(++count)+").jpg");
		}
		
		
		FileOutputStream fos = new FileOutputStream(file);

		byte[] buf = new byte[1024];

		int len = 0;

		while ((len = in.read(buf)) != -1) {
			
			
			
			fos.write(buf, 0, len);
			
			if(file.length()>SIZE){
				System.out.println(ip+"文件體積過大");
				
				fos.close();
				s.close();
				
				
				System.out.println(ip+"...."+file.delete());
				
				return ;
			}
		}

		// 獲取socket輸出流，將上傳成功字樣發給客戶端。
		OutputStream out = s.getOutputStream();
		out.write("上傳成功".getBytes());

		fos.close();
		s.close();
		}catch(IOException e){
			
		}

	}

}
