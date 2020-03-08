package IO流.I_FileStream文件流.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 需求：作業：將c盤的一個文本文件複製到d盤。
 * 
 * 思路：
 * 1，需要讀取源，
 * 2，將讀到的源數據寫入到目的地。
 * 3，既然是操作文本數據，使用字符流。 
 * 
 */

public class CopyTextTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		//1,讀取一個已有的文本文件，使用字符讀取流和文件相關聯。
		FileReader fr = new FileReader("relate英文.txt");
		//2,創建一個目的，用於存儲讀到數據。
		FileWriter fw = new FileWriter("copytext_1.txt");
		//3,頻繁的讀寫操作。
		int ch = 0;
		while((ch=fr.read())!=-1){
			fw.write(ch);
		}
		//4,關閉流資源。 
		
		fw.close();
		fr.close();
	}

}
