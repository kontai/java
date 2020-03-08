package IO流.I_FileStream文件流.I_fileWritter;

import java.io.FileWriter;
import java.io.IOException;

//需求：將一些文字存儲到硬盤一個文件中。

public class FileWriterDemo {

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		//創建一個可以往文件中寫入字符數據的字符輸出流對象。
		/*
		 * 既然是往一個文件中寫入文字數據，那麼在創建對像時，就必須明確該文件(用於存儲數據的目的地)。
		 * 
		 * 如果文件不存在，則會自動創建。
		 * 如果文件存在，則會被覆蓋。
		 * 
		 * 如果構造函數中加入true，可以實現對文件進行續寫！
		 */
		FileWriter fw = new FileWriter("demo.txt",true);
		
		/*
		 * 調用Writer對像中的write(string)方法，寫入數據。 
		 * 
		 * 其實數據寫入到臨時存儲緩衝區中。
		 * 
		 */
		fw.write("abcde"+LINE_SEPARATOR+"hahaha");
//		fw.write("xixi");
		
		/*
		 * 進行刷新，將數據直接寫到目的地中。
		 */
		
//		fw.flush();
		
		/*
		 * 關閉流，關閉資源。在關閉前會先調用flush刷新緩衝中的數據到目的地。
		 */
		fw.close();
		
//		fw.write("haha");// java.io.IOException: Stream closed
		
		
		
	}

}
