package IO流.XI_Property集合;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;



/*
 * 定義功能，獲取一個應用程序運行的次數，如果超過5次，給出使用次數已到請註冊的提示。並不要在運行程序。
 * 
 * 思路：
 * 1，應該有計數器。 
 * 每次程序啟動都需要計數一次,並且是在原有的次數上進行計數。
 * 2，計數器就是一個變量。 突然冒出一想法，程序啟動時候進行計數，計數器必須存在於內存並進行運算。
 * 可是程序一結束，計數器消失了。那麼再次啟動該程序，計數器又重新被初始化了。
 * 而我們需要多次啟動同一個應用程序，使用的是同一個計數器。 
 * 這就需要計數器的生命週期變長，從內存存儲到硬盤文件中。
 * 
 * 3,如何使用這個計數器呢？
 * 	首先，程序啟動時，應該先讀取這個用於記錄計數器信息的配置文件。
 *  獲取上一次計數器次數。 並進行試用次數的判斷。
 *  其次，對該次數進行自增，並自增後的次數重新存儲到配置文件中。 
 *  
 * 
 * 4，文件中的信息該如何進行存儲並體現。
 * 	直接存儲次數值可以，但是不明確該數據的含義。 所以起名字就變得很重要。
 * 	這就有了名字和值的對應，所以可以使用鍵值對。
 * 	可是映射關係map集合搞定，又需要讀取硬盤上的數據，所以map+io = Properties.
 * 
 * 
 * 
 */

public class PropertiesTest {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws Exception 
	 */
	public static void main(String[] args) throws IOException  {
		
		getAppCount();
		
	}
	
	public static void getAppCount() throws IOException{
		
		//將配置文件封裝成File對象。
		File confile = new File("count.properties");
		
		if(!confile.exists()){
			confile.createNewFile();
		}
		
		FileInputStream fis = new FileInputStream(confile);
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		
		//從集合中通過鍵獲取次數。		
		String value = prop.getProperty("time");
		//定義計數器。記錄獲取到的次數。
		int count =0;
		if(value!=null){
			count = Integer.parseInt(value);
			if(count>=5){
//				System.out.println("使用次數已到，請註冊，給錢！");
//				return;
				throw new RuntimeException("使用次數已到，請註冊，給錢！");
			}
		}
		count++;
		
		//將改變後的次數重新存儲到集合中。
		prop.setProperty("time", count+"");
		
		FileOutputStream fos = new FileOutputStream(confile);
		
		prop.store(fos, "");
		
		fos.close();
		fis.close();
		
		
	}

}






