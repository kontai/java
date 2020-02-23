package 集合框架.VII其他常用對象API.Runtime類;

import java.io.IOException;

public class RuntimeDemo {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException {

		/*
		 * Runtime:沒有構造方法摘要，說明該類不可以創建對象。
		 * 又發現還有非靜態的方法。說明該類應該提供靜態的返回該類對象的方法。
		 * 而且只有一個，說明Runtime類使用了單例設計模式。
		 * 
		 */
		
		Runtime r = Runtime.getRuntime();
		
//		execute: 執行。 xxx.exe 
		
		Process p = r.exec("notepad.exe");
		Thread.sleep(5000);
		p.destroy();	//只能關閉在此開啟的程式
	}

}
