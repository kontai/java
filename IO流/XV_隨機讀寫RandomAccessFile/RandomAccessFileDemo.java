package IO流.XV_隨機讀寫RandomAccessFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		/*
		 * RandomAccessFile
		 * 一看這個類名字，糾結。不是io體系中的子類。
		 * 
		 * 特點：
		 * 1，該對像即能讀，又能寫。
		 * 2，該對像內部維護了一個byte數組，並通過指針可以操作數組中的元素，
		 * 3，可以通過getFilePointer方法獲取指針的位置，和通過seek方法設置指針的位置。
		 * 4，其實該對象就是將字節輸入流和輸出流進行了封裝。 
		 * 5，該對象的源或者目的只能是文件。通過構造函數就可以看出。 
		 * 
		 * 
		 */
		
//		writeFile();
//		readFile();
		randomWrite();
	}
	
	public static void randomWrite() throws IOException{
		RandomAccessFile raf = new RandomAccessFile("ranacc.txt", "rw");
		
		//往指定位置寫入數據。
		raf.seek(3*8);
		
		raf.write("哈哈".getBytes());
		raf.writeInt(108);
		
		raf.close();
	}
	
	
	public static void readFile() throws IOException {
		
		RandomAccessFile raf = new RandomAccessFile("ranacc.txt", "r");
		
		//通過seek設置指針的位置。
		raf.seek(1*8);//隨機的讀取。只要指定指針的位置即可。 
		
		byte[] buf = new byte[4];
		raf.read(buf);
		
		String name = new String(buf);
		
		int age = raf.readInt();
		
		System.out.println("name="+name);
		System.out.println("age="+age);
		
		System.out.println("pos:"+raf.getFilePointer());
		
		raf.close();
		
		
	}

	//使用RandomAccessFile對像寫入一些人員信息，比如姓名和年齡。
	public static void writeFile() throws IOException{
		/*
		 * 如果文件不存在，則創建，如果文件存在，不創建
		 * 
		 */
		RandomAccessFile raf = new RandomAccessFile("ranacc.txt","rw");
		
		raf.write("張三".getBytes());
		raf.writeInt(97);
		raf.write("小強".getBytes());
		raf.writeInt(99);
//		
		raf.close();
	}

}
