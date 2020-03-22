package IO流.X_IO_FILE類與常見功能.II_獲取.練習;

import java.io.File;

/*
 * 需求：對指定目錄進行所有內容的列出（包含子目錄中的內容）
 * 也可以理解為 深度遍歷。
 * 
 * 
 */

public class FileTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		File dir = new File("e:\\Python27");
		
		listAll(dir,0);
	}

	public static void listAll(File dir,int level) {
		
	
		System.out.println(getSpace(level)+dir.getName());
		//獲取指定目錄下當前的所有文件夾或者文件對像
		
		level++;
		File[] files = dir.listFiles();
		
		for(int x=0; x<files.length; x++){
			
			if(files[x].isDirectory()){
				listAll(files[x],level);
			}
			else
				System.out.println(getSpace(level)+files[x].getName());
		}	
	}

	private static String getSpace(int level) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("|--");
		for(int x=0; x<level; x++){
			sb.insert(0,"|  ");
		}
		
		return sb.toString();
	}
	

}
