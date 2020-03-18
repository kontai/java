package IO流.X_IO_FILE類與常見功能.I_構造函數和字段;

import java.io.File;

public class FileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		constructorDemo();
		
		
	}

	public static void constructorDemo() {
		
		//可以將一個已存在的，或者不存在的文件或者目錄封裝成file對象。
		File f1 = new File("c:\\a.txt");
		
		File f2 = new File("c:\\","a.txt");
		
		File f = new File("c:\\");
		
		File f3 = new File(f,"a.txt");
		
		File f4 = new File("c:"+File.separator+"abc"+File.separator+"a.txt");
		System.out.println(f4);
		
		
	}
	
	

}
