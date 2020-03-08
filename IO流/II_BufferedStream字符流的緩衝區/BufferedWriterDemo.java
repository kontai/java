package IO流.II_BufferedStream字符流的緩衝區;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("buf.txt");
		
		//為了提高寫入的效率。使用了字符流的緩衝區。
		//創建了一個字符寫入流的緩衝區對象，並和指定要被緩衝的流對像相關聯
		BufferedWriter bufw = new BufferedWriter(fw);
		
		//使用緩衝區的寫入方法將數據先寫入到緩衝區中。
//		bufw.write("abcdefq"+LINE_SEPARATOR+"hahahha");
//		bufw.write("xixiixii");
//		bufw.newLine();
//		bufw.write("heheheheh");
		
		for(int x=1; x<=4; x++){
			bufw.write("abcdef"+x);
			bufw.newLine();
			bufw.flush();
		}
		
		
		//使用緩衝區的刷新方法將數據刷目的地中。
//		bufw.flush();
		
		
		//關閉緩衝區。其實關閉的就是被緩衝的流對象。
		bufw.close();
		
//		fw.write("hehe");
		
//		fw.close();
	}

}

