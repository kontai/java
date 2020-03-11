package IO流.V_ByteStream字節流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		
		demo_read();
	}

	public static void demo_read() throws IOException {
		
		//1，創建一個讀取流對象。和指定文件關聯。
		FileInputStream fis = new FileInputStream("bytedemo.txt");
		
//		System.out.println(fis.available());
//		byte[] buf = new byte[fis.available()];		
//		fis.read(buf);
//		System.out.println(new String(buf));
		
		
		//建議使用這種讀取數據的方式
//		byte[] buf = new byte[1024];		
//		int len = 0;
//		
//		while((len=fis.read(buf))!=-1){
//			System.out.println(new String(buf,0,len));
//		}
		
		
//		int ch = 0;
//		while((ch=fis.read())!=-1){
//			System.out.println((char)ch);
//		}
		
		//一次讀取一個字節。
//		int ch = fis.read();		
//		System.out.println(ch);
		
		fis.close();
		
	}

	public static void demo_write() throws IOException {
		
		//1，創建字節輸出流對象。用於操作文件.
		FileOutputStream fos = new FileOutputStream("bytedemo.txt");
		
		//2,寫數據。直接寫入到了目的地中。 
		fos.write("abcdefg".getBytes());
		
//		fos.flush();
		fos.close();//關閉資源動作要完成。 
	}

}
