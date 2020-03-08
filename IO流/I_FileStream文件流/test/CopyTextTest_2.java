package IO流.I_FileStream文件流.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * The type Copy text test 2.
 */
public class CopyTextTest_2 {

	private static final int BUFFER_SIZE = 1024;	//緩衝區

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {

		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("relate英文.txt");
			fw = new FileWriter("copytest_2.txt");
			
			//創建一個臨時容器，用於緩存讀取到的字符。
			char[] buf = new char[BUFFER_SIZE];//這就是緩衝區。 
			
			//定義一個變量記錄讀取到的字符數，(其實就是往數組裡裝的字符個數 )
			int len = 0;
			
			while((len=fr.read(buf))!=-1){
				fw.write(buf, 0, len);
				System.out.println("Running:"+len);
			}
			
		} catch (Exception e) {
//			System.out.println("讀寫失敗");
			throw new RuntimeException("讀寫失敗");
		}finally{
			if(fw!=null)
				try {
					fw.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			if(fr!=null)
				try {
					fr.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
		}
	}

}
