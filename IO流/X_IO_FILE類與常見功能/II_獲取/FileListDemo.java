package IO流.X_IO_FILE類與常見功能.II_獲取;

import java.io.File;

import cn.itcast.io.p2.filter.FilterByHidden;
import cn.itcast.io.p2.filter.SuffixFilter;

public class FileListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		listDemo_2();
	}
	
	

	public static void listDemo_3() {
		
		File dir = new File("c:\\");
		
		File[] files = dir.listFiles(new FilterByHidden());
		
		for(File file : files){
			System.out.println(file);
		}
	}



	public static void listDemo_2() {
		
		File dir = new File("c:\\");
		
		String[] names = dir.list(new SuffixFilter(".txt"));
		
		for(String name : names){
			System.out.println(name);
		}
		
	}



	public static void listDemo() {
		File file = new File("c:\\");
		/*
		 * 獲取當前目錄下的文件以及文件夾的名稱，包含隱藏文件。
		 * 調用list方法的File對像中封裝的必須是目錄。
		 * 否則會發生NullPointerException
		 * 如果訪問的系統級目錄也會發生空指針異常。
		 * 
		 * 如果目錄存在但是沒有內容，會返回一個數組，但是長度為0.
		 * 
		 */
		String[] names = file.list();
		System.out.println(names.length);
		
		for(String name : names){
			System.out.println(name);
		}
		
		
	}

}
