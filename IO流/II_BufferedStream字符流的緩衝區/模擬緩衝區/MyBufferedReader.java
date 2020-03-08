package IO流.II_BufferedStream字符流的緩衝區.模擬緩衝區;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * 自定義的讀取緩衝區。其實就是模擬一個BufferedReader.
 * 
 * 分析：
 * 緩衝區中無非就是封裝了一個數組，
 * 並對外提供了更多的方法對數組進行訪問。
 * 其實這些方法最終操作的都是數組的角標。
 * 
 * 緩衝的原理：
 * 其實就是從源中獲取一批數據裝進緩衝區中。
 * 在從緩衝區中不斷的取出一個一個數據。
 * 
 * 在此次取完後，在從源中繼續取一批數據進緩衝區。
 * 當源中的數據取光時，用-1作為結束標記。 
 * 
 * 
 * @author Administrator
 *
 */
public class MyBufferedReader extends Reader {

	private Reader r;
	
	//定義一個數組作為緩衝區。
	private char[] buf = new char[1024];
	
	//定義一個指針用於操作這個數組中的元素。當操作到最後一個元素後，指針應該歸零。	
	private int pos = 0;	
	
	
	//定義一個計數器用於記錄緩衝區中的數據個數。 當該數據減到0，就從源中繼續獲取數據到緩衝區中。
	private int count = 0;
	
	
	MyBufferedReader(Reader r){
		this.r = r;
	}
	
	/**
	 * 該方法從緩衝區中一次取一個字符。 
	 * @return
	 * @throws IOException
	 */
	public int myRead() throws IOException{
		
		if(count==0){
			count = r.read(buf);
			pos = 0;
		}
		if(count<0)
			return -1;
		
		char ch = buf[pos++];
		
		count--;
		
		return ch;
		
		/*
		//1,從源中獲取一批數據到緩衝區中。需要先做判斷，只有計數器為0時，才需要從源中獲取數據。
		if(count==0){
			count = r.read(buf);
			
			if(count<0)
				return -1;
			
			//每次獲取數據到緩衝區後，角標歸零.
			pos = 0;
			char ch = buf[pos];
			
			pos++;
			count--;
			
			return ch;
			
		}else if(count>0){
			
			char ch = buf[pos];
			
			pos++;
			count--;
			
			return ch;
			
		}*/
		
	}
	
	public String myReadLine() throws IOException{
		
		StringBuilder sb = new StringBuilder();
		
		int ch = 0;
		while((ch = myRead())!=-1){
			
			if(ch=='\r')
				continue;
			if(ch=='\n')
				return sb.toString();
			//將從緩衝區中讀到的字符，存儲到緩存行數據的緩衝區中。
			sb.append((char)ch);
			
		}		
		
		if(sb.length()!=0)
			return sb.toString();
		return null;
	}

	public void myClose() throws IOException {
		
		r.close();
	}

	@Override
	public int read(char[] cbuf, int off, int len) throws IOException {
		
		return 0;
	}

	@Override
	public void close() throws IOException {
	}
}

















