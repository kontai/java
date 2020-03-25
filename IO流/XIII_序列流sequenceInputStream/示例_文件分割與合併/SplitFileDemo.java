package IO流.XIII_序列流sequenceInputStream.示例_文件分割與合併;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * 文件切割器。
 * 
 * 
 * 
 * 
 */

public class SplitFileDemo {

	private static final int SIZE = 1024 * 1024;

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		File file = new File("c:\\aa.mp3");

		splitFile_2(file);
	}

	private static void splitFile_2(File file) throws IOException {

		// 用讀取流關聯源文件。
		FileInputStream fis = new FileInputStream(file);

		// 定義一個1M的緩衝區。
		byte[] buf = new byte[SIZE];

		// 創建目的。
		FileOutputStream fos = null;

		int len = 0;
		int count = 1;
		
		
		/*
		 * 切割文件時，必須記錄住被切割文件的名稱，以及切割出來碎片文件的個數。 以方便於合併。
		 * 這個信息為了進行描述，使用鍵值對的方式。用到了properties對像
		 * 
		 */
		Properties prop  = new Properties();
		
	

		File dir = new File("c:\\partfiles");
		if (!dir.exists())
			dir.mkdirs();

		while ((len = fis.read(buf)) != -1) {

			fos = new FileOutputStream(new File(dir, (count++) + ".part"));
			fos.write(buf, 0, len);
			fos.close();
		}
		
		//將被切割文件的信息保存到prop集合中。
		prop.setProperty("partcount", count+"");
		prop.setProperty("filename", file.getName());
		
		
		
		fos = new FileOutputStream(new File(dir,count+".properties"));
		
		//將prop集合中的數據存儲到文件中。 
		prop.store(fos, "save file info");

		fos.close();
		fis.close();

	}

	public static void splitFile(File file) throws IOException {

		// 用讀取流關聯源文件。
		FileInputStream fis = new FileInputStream(file);

		// 定義一個1M的緩衝區。
		byte[] buf = new byte[SIZE];

		// 創建目的。
		FileOutputStream fos = null;

		int len = 0;
		int count = 1;

		File dir = new File("c:\\partfiles");
		if (!dir.exists())
			dir.mkdirs();

		while ((len = fis.read(buf)) != -1) {

			fos = new FileOutputStream(new File(dir, (count++) + ".part"));
			fos.write(buf, 0, len);
		}

		fos.close();
		fis.close();

	}

}
