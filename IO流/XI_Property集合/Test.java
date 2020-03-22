package IO流.XI_Property集合;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * 
 * 獲取指定目錄下，指定擴展名的文件(包含子目錄中的)
 * 這些文件的絕對路徑寫入到一個文本文件中。
 * 
 * 簡單說，就是建立一個指定擴展名的文件的列表。 
 * 
 * 思路：
 * 1，必須進行深度遍歷。
 * 2，要在遍歷的過程中進行過濾。將符合條件的內容都存儲到容器中。
 * 3，對容器中的內容進行遍歷並將絕對路徑寫入到文件中。 
 * 
 *
 */
public class Test {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
			
		File dir = new File("e:\\java0331");
		
		FilenameFilter filter = new FilenameFilter(){
			@Override
			public boolean accept(File dir, String name) {
				
				return name.endsWith(".java");
			}			
		};
		
		List<File> list = new ArrayList<File>();
		
		getFiles(dir,filter,list);
		
		File destFile = new File(dir,"javalist.txt");
		
		write2File(list,destFile);
		
	}
	/**
	 * 對指定目錄中的內容進行深度遍歷，並按照指定過濾器，進行過濾，
	 * 將過濾後的內容存儲到指定容器List中。
	 * @param dir
	 * @param filter
	 * @param list
	 */
	public static void getFiles(File dir,FilenameFilter filter,List<File> list){
		
		File[] files = dir.listFiles();
		
		for(File file : files){
			if(file.isDirectory()){
				//遞歸啦！
				getFiles(file,filter,list);
			}else{
				//對遍歷到的文件進行過濾器的過濾。將符合條件File對象，存儲到List集合中。 
				if(filter.accept(dir, file.getName())){
					list.add(file);
				}
			}
		}
		
	}
	
	public static void write2File(List<File> list,File destFile)throws IOException{
		
		BufferedWriter bufw = null;
		try {
			bufw = new BufferedWriter(new FileWriter(destFile));
			for(File file : list){
				bufw.write(file.getAbsolutePath());
				bufw.newLine();
				bufw.flush();
			}
			
			
		} /*catch(IOException e){
			
			throw new RuntimeException("寫入失敗");
		}*/finally{
			if(bufw!=null)
				try {
					bufw.close();
				} catch (IOException e) {
					
					throw new RuntimeException("關閉失敗");
				}
		}
	}

}
