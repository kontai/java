package IO流.XII_打印流Print;

import java.io.*;

public class PrintWriterDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		/*
		 * PrintWriter：字符打印流。
		 * 構造函數參數：
		 * 1，字符串路徑。
		 * 2，File對象。
		 * 3，字節輸出流。
		 * 4，字符輸出流。
		 * 
		 */

		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));

		PrintWriter out = new PrintWriter(new FileWriter("out.txt"),true);
		String line =  null;
		while((line=bufr.readLine())!=null){
			if("over".equals(line))
				break;
			out.println(line.toUpperCase());
//			out.flush();
		}
		
		out.close();
		bufr.close();
	}

}
