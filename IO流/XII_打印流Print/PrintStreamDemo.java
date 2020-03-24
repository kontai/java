package IO流.XII_打印流Print;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		/*
		 * PrintStream:
		 * 1,提供了打印方法可以對多種數據類型值進行打印。並保持數據的表示形式。 
		 * 2，它不拋IOException.
		 * 
		 * 構造函數，接收三種類型的值：
		 * 1，字符串路徑。
		 * 2，File對象。
		 * 3，字節輸出流。
		 */
		
		PrintStream out = new PrintStream("print.txt");
		
//		int by = read();
//		write(by);
		
//		out.write(610);//只寫最低8位，
		
//		out.print(97);//將97先變成字符保持原樣將數據打印到目的地。 
		
		out.close();
		
		
	}

}
