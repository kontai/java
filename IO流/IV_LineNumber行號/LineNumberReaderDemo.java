package IO流.IV_LineNumber行號;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReaderDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("IO流_2.txt");
		LineNumberReader lnr = new LineNumberReader(fr);
		
		String line = null;
		lnr.setLineNumber(100);
		while((line=lnr.readLine())!=null){
			System.out.println(lnr.getLineNumber()+":"+line);
		}
		
		lnr.close();
	}
}
