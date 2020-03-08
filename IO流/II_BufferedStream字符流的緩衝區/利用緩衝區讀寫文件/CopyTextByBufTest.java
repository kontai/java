package IO流.II_BufferedStream字符流的緩衝區.利用緩衝區讀寫文件;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextByBufTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("buf.txt");		
		BufferedReader bufr = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter("buf_copy.txt");
		BufferedWriter bufw = new BufferedWriter(fw);
		
		
		String line = null;
		while((line=bufr.readLine())!=null){
			bufw.write(line);
			bufw.newLine();
			bufw.flush();
		}

 		BufferedReader newBR=new BufferedReader(new FileReader("buf.txt"));
		System.out.println(newBR);
		
		
		
		/*
		int ch = 0;
		
		while((ch=bufr.read())!=-1){
			
			bufw.write(ch);
		}
		*/
		bufw.close();
		bufr.close();
	}

}
