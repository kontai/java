package IO流.XI_Property集合;

import java.io.*;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		/*
		 * Map
		 * 	|--Hashtable
		 * 		|--Properties:
		 * 
		 * Properties集合：
		 * 特點：
		 * 1，該集合中的鍵和值都是字符串類型。
		 * 2，集合中的數據可以保存到流中，或者從流獲取。
		 * 
		 * 通常該集合用於操作以鍵值對形式存在的配置文件。 
		 * 
		 * 
		 */
		
//		methodDemo_4();
//		myLoad();

		test();
	}
	
	
	//對已有的配置文件中的信息進行修改。 
	/*
	 * 讀取這個文件。
	 * 並將這個文件中的鍵值數據存儲到集合中。
	 * 在通過集合對數據進行修改。
	 * 在通過流將修改後的數據存儲到文件中。 
	 */
	public static void test() throws IOException{
		//讀取這個文件。
		File file = new File("info.txt");
		if(!file.exists()){
			file.createNewFile();
		}
		FileReader fr = new FileReader(file);

		//注意!在這裡新建,將原始檔案清空
//		FileWriter fw = new FileWriter(file);

		//創建集合存儲配置信息。
		Properties prop = new Properties();



		//將流中信息存儲到集合中。
		prop.load(fr);
		
		prop.setProperty("wangwu", "16");
		
		
		
		FileWriter fw = new FileWriter(file);

		prop.store(fw,"");
		
//		prop.list(System.out);
		
		fw.close();
		fr.close();
		
		
		
	}
	
	
	
	//模擬一下load方法。
	public static void myLoad() throws IOException{
		
		Properties prop  = new Properties();
		
		BufferedReader bufr = new BufferedReader(new FileReader("info.txt"));
		
		String line = null;
		
		while((line=bufr.readLine())!=null){
			
			if(line.startsWith("#"))
				continue;
			
			String[] arr = line.split("=");
			
//			System.out.println(arr[0]+"::"+arr[1]);
			prop.setProperty(arr[0], arr[1]);
		}
		
		prop.list(System.out);
		
		bufr.close();
		
	}
	
	public static void methodDemo_4() throws IOException {	
		
		Properties prop  = new Properties();
		
		//集合中的數據來自於一個文件。 
		//注意；必須要保證該文件中的數據是鍵值對。
		//需要使用到讀取流。 
		FileInputStream fis = new FileInputStream("info.txt");
		
		//使用load方法。 
		prop.load(fis);
		
		prop.list(System.out);
		
		
		
	}

	public static void methodDemo_3() throws IOException {
		Properties prop  = new Properties();
		
		//存儲元素。 
		prop.setProperty("zhangsan","30");
		prop.setProperty("lisi","31");
		prop.setProperty("wangwu","36");
		prop.setProperty("zhaoliu","20");
		
		//想要將這些集合中的字符串鍵值信息持久化存儲到文件中。
		//需要關聯輸出流。
		FileOutputStream fos = new FileOutputStream("info.txt");
		
		//將集合中數據存儲到文件中，使用store方法。
		prop.store(fos, "info");
		
		fos.close();
		
	}

	/**
	 * 演示Properties集合和流對像相結合的功能。
	 */
	
	public static void methodDemo_2(){
		Properties prop  = new Properties();
		
		//存儲元素。 
//		prop.setProperty("zhangsan","30");
//		prop.setProperty("lisi","31");
//		prop.setProperty("wangwu","36");
//		prop.setProperty("zhaoliu","20");
	
		prop = System.getProperties();
		prop.list(System.out);
	}
	
	/*
	 * Properties集合的存和取。
	 */
	
	public static void propertiesDemo(){
		//創建一個Properties集合。
		
		Properties prop  = new Properties();
		
		//存儲元素。 
		prop.setProperty("zhangsan","30");
		prop.setProperty("lisi","31");
		prop.setProperty("wangwu","36");
		prop.setProperty("zhaoliu","20");
		
		//修改元素。 
		prop.setProperty("wangwu","26");
		
		//取出所有元素。
		Set<String> names = prop.stringPropertyNames();

		for(String name : names){
			String value = prop.getProperty(name);
			System.out.println(name+":"+value);
		}
	}
}





