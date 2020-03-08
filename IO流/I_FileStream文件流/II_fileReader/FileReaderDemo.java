package IO流.I_FileStream文件流.II_fileReader;

import java.io.FileReader;
import java.io.IOException;

//需求：讀取一個文本文件。將讀取到的字符打印到控制台.

public class FileReaderDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		
		//1,創建讀取字符數據的流對象。
		/*
		 * 在創建讀取流對像時，必須要明確被讀取的文件。一定要確定該文件是存在的。 
		 * 
		 * 用一個讀取流關聯一個已存在文件。 
		 */

		FileReader fr = new FileReader("demo.txt");

		int ch = 0;

		while((ch=fr.read())!=-1){
			System.out.println((char)ch);
		}



		/*
		//用Reader中的read方法讀取字符。
		int ch = fr.read();
		System.out.println((char)ch);
		int ch1 = fr.read();
		System.out.println(ch1);
		int ch2 = fr.read();
		System.out.println(ch2);
		*/
		
		fr.close();
	}

}
