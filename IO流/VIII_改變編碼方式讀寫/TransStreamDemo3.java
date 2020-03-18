package IO流.VIII_改變編碼方式讀寫;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class TransStreamDemo3 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		readText_2();
	}

	public static void readText_2() throws IOException, FileNotFoundException {
		
		
		InputStreamReader isr = new InputStreamReader(new FileInputStream("gbk_1.txt"),"utf-8");
		char[] buf = new char[10];
		int len = isr.read(buf);
		String str = new String(buf,0,len);
		System.out.println(str);
		
		isr.close();
	}

	public static void readText_1() throws IOException {
		
		FileReader fr = new FileReader("gbk_1.txt");
		
		char[] buf = new char[10];
		int len = fr.read(buf);
		String str = new String(buf,0,len);
		System.out.println(str);
		
		fr.close();
		
		
	}

	public static void writeText_3() throws IOException {
		
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("u8_1.txt"),"UTF-8");
		
		osw.write("你好");
		osw.close();
		
	}

	public static void writeText_2() throws IOException {
		
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("gbk_3.txt"),"GBK");
		
//		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("gbk_3.txt"),"GBK");
//		FileWriter fw = new FileWriter("gbk_1.txt");
		
		/*
		 * 這兩句代碼的功能是等同的。 
		 * FileWriter：其實就是轉換流指定了本機默認碼表的體現。而且這個轉換流的子類對象，可以方便操作文本文件。
		 *             簡單說：操作文件的字節流+本機默認的編碼表。
		 * 				這是按照默認碼表來操作文件的便捷類。
		 * 
		 * 如果操作文本文件需要明確具體的編碼。FileWriter就不行了。必須用轉換流。 
		 * 
		 */
		
		
		osw.write("你好");
		
		osw.close();
		
		
	}

	public static void writeText_1() throws IOException {
		
		FileWriter fw = new FileWriter("gbk_1.txt");
		
		fw.write("你好");
		
		fw.close();
	}

}
