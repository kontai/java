package IO流.X_IO_FILE類與常見功能.III_刪除;

import java.io.File;


/*
 * 刪除一個帶內容的目錄。 
 * 
 * 原理：必須從最裡面往外刪。 
 * 需要進行深度遍歷。
 * 
 * 
 * 
 */
public class RemoveDirTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		File dir  = new File("e:\\demodir");
//		dir.delete();
		removeDir(dir);
	}

	public static void removeDir(File dir) {
		
		File[] files = dir.listFiles();
		
		for(File file : files){
			
			if(file.isDirectory()){
				removeDir(file);
			}else{
				System.out.println(file+":"+file.delete());
			}
		}
		System.out.println(dir+":"+dir.delete());
	}
	

}
