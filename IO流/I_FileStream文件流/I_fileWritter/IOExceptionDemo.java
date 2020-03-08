package IO流.I_FileStream文件流.I_fileWritter;

import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionDemo {

	private static final String LINE_SEPARATOR = System
			.getProperty("line.separator");

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) {

		FileWriter fw = null;
		try {

			fw = new FileWriter("k:\\demo.txt");

			fw.write("abcde" + LINE_SEPARATOR + "hahaha");

		} catch (IOException e) {
			System.out.println(e.toString());
		} finally {
			if (fw != null)	//未加判斷,會導致NullPointerException(未開啟文件的關係)
				try {
					fw.close();
				} catch (IOException e) {
					// code....
					throw new RuntimeException("關閉失敗");
				}
		}

	}

}
