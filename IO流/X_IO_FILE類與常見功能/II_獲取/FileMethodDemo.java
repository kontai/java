package IO流.X_IO_FILE類與常見功能.II_獲取;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

public class FileMethodDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		
		/*
		 * File對象的常見方法。
		 * 
		 * 1，獲取。
		 * 		1.1 獲取文件名稱。
		 * 		1.2 獲取文件路徑。
		 * 		1.3 獲取文件大小。
		 * 		1.4 獲取文件修改時間。
		 * 
		 * 2，創建與刪除。
		 * 		
		 * 3，判斷。
		 * 
		 * 4， 重命名
		 * 		
		 */
//		getDemo();
//		createAndDeleteDemo();
//		isDemo();
//		renameToDemo();
		
//		listRootsDemo();
	}
	
	
	
	
	
	public static void listRootsDemo() {
		
		File file = new File("d:\\");
		
		System.out.println("getFreeSpace:"+file.getFreeSpace());
		System.out.println("getTotalSpace:"+file.getTotalSpace());
		System.out.println("getUsableSpace:"+file.getUsableSpace());
		
//		File[] files  = File.listRoots();		
//		for(File file : files){
//			System.out.println(file);
//		}
	}

	public static void renameToDemo() {
		
		File f1 = new File("c:\\9.mp3");
		
		File f2 = new File("d:\\aa.mp3");
		
		boolean b = f1.renameTo(f2);
		
		System.out.println("b="+b);
	}

	public static void isDemo() throws IOException{
		File f = new File("aaa");
		
//		f.mkdir();
		f.createNewFile();
		
//		boolean b = f.exists();		
//		System.out.println("b="+b);
		// 最好先判斷是否存在。 
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		
		
	}
	
	
	
	
	public static void createAndDeleteDemo() throws IOException {
		
		File dir = new File("abc\\q\\e\\c\\z\\r\\w\\y\\f\\e\\g\\s");
		
//		boolean b = dir.mkdir();//make directory		
//		System.out.println("b="+b);
//		dir.mkdirs();//創建多級目錄

		System.out.println(dir.delete());
//只能刪除空的資料夾
//當創建多層目錄(exp:a\\b\\c\\d\\e),只刪除最底層空資料夾(e)

//		System.out.println(dir.delete());
		
		
//		文件的創建和刪除。
//		File file = new File("file.txt");
		
		/*
		 * 和輸出流不一樣，如果文件不存在，則創建，如果文件存在，則不創建。 
		 * 
		 */
//		boolean b = file.createNewFile();		
//		System.out.println("b="+b);
		
//		boolean b = file.delete();
//		System.out.println("b="+b);
		
	}



	public static void getDemo(){
//		File file = new File("E:\\java0331\\day22e\\a.txt");
		File file = new File("a.txt");
		
		String name = file.getName();
		
		String absPath = file.getAbsolutePath();//絕對路徑。
		
		String path = file.getPath();
		
		long len = file.length();
		
		long time = file.lastModified();	//常用於判斷在文件使用過程,是否被修改,if yes,重新加載文件。
		
		Date date = new Date(time);
		
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
		
		String str_time = dateFormat.format(date);
		
		
		System.out.println("parent:"+file.getParent());
		
		System.out.println("name:"+name);
		System.out.println("absPath:"+absPath);
		System.out.println("path:"+path);
		System.out.println("len:"+len);
		System.out.println("time:"+time);
		System.out.println("str_time:"+str_time);
		
	}

}
