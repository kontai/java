package IO流.VII_字節與字符轉換;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TransStreamDemo2_代碼簡化版 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		
		/*
		 * 1,需求：將鍵盤錄入的數據寫入到一個文件中。 
		 * 
		 * 2,需求：將一個文本文件內容顯示在控制台上。
		 * 
		 * 3,需求：將一個文件文件中的內容複製到的另一個文件中。
		 */
		
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("b.txt")));
		
		
		String line = null;
		
		while((line=bufr.readLine())!=null){
			if("over".equals(line))
				break;
			
			bufw.write(line.toUpperCase());
			bufw.newLine();
			bufw.flush();
		}
		
		
	}

}
