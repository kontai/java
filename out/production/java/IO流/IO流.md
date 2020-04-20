

輸入流和輸出流相對於內存設備而言.

- 將外設中的數據讀取到內存中:輸入
- 將內存的數寫入到外設中：輸出。


- 字符流的由來：
其實就是：字節流讀取文字字節數據後，不直接操作而是先查指定的編碼表。獲取對應的文字。
在對這個文字進行操作。簡單說：字節流+編碼表 

---------------------------------------

- 字節流的兩個頂層父類：
1，InputStream  2，OutputStream.

- 字符流的兩個頂層父類：
1，Reader 2，Writer

這些體系的子類都以父類名作為後綴。 
而且子類名的前綴就是該對象的功能。


就從熟悉的文字開始字符流，


- 需求：
將一些文字存儲到硬盤一個文件中。
記住；如果要操作文字數據，建議優先考慮字符流。
而且要將數據從內存寫到硬盤上，要使用字符流中的輸出流。Writer
硬盤的數據基本體現是文件。 希望找到一個可以操作文件的Writer.

找到了FileWriter



- 需求：讀取一個文本文件。將讀取到的字符打印到控制台.
同上，找到了FileReader



作業：將c盤的一個文本文件複製到d盤。
分析：
複製原理：
讀取c盤文件中的數據，
將這些數據寫入到d盤當中。
連讀帶寫。

---

- 字符流緩衝區：
BufferedWriter 
	：newLine();
	
BufferedReader:
	: readLine();


使用緩衝區複製一個文本文件。 



裝飾設計模式：
	對一組對象的功能進行增強時，就可以使用該模式進行問題的解決。 
	

裝飾和繼承都能實現一樣的特點：進行功能的擴展增強。 

有什麼區別呢？

首先有一個繼承體系。
```aidl
Writer
	|--TextWriter:用於操作文本
	|--MediaWriter：用於操作媒體。
```
	
想要對操作的動作進行效率的提高。
按照面向對象，可以通過繼承對具體的進行功能的擴展。 
效率提高需要加入緩衝技術。
	
```
Writer
	|--TextWriter:用於操作文本
		|--BufferTextWriter:加入了緩衝技術的操作文本的對象。
	|--MediaWriter：用於操作媒體。
		|--BufferMediaWriter:
	
```

到這裡就哦了。但是這樣做好像並不理想。
如果這個體系進行功能擴展，有多了流對象。
那麼這個流要提高效率，是不是也要產生子類呢？是。這時就會發現只為提高功能，進行的繼承，
導致繼承體系越來越臃腫。不夠靈活。 

重新思考這個問題？
既然加入的都是同一種技術--緩衝。
前一種是讓緩衝和具體的對象相結合。 
可不可以將緩衝進行單獨的封裝，哪個對象需要緩衝就將哪個對象和緩衝關聯。

```aidl
class Buffer{
	Buffer(TextWriter w)
	{}
	
	Buffer(MediaWirter w)
	{
	
	}
}
class BufferWriter extends Writer{
	BufferWriter(Writer w)
	{
	}
}
```
```aidl
Writer
	|--TextWriter:用於操作文本
	|--MediaWriter：用於操作媒體。
	|--BufferWriter:用於提高效率。
```
	
裝飾比繼承靈活。

特點：裝飾類和被裝飾類都必須所屬同一個接口或者父類。 



--------------------------------------

- 字節流：

InputStream  
	

OutputStream

字節流：
FileInputStream 
FileOutputStream
BufferedInputStream
BufferedOutputStream
字符流：
Writer Reader
FileReader
FileWriter
BufferedReader
BufferedWriter




================================================================

- 轉換流：
InputStreamReader ：字節到字符的橋樑。解碼。
OutputStreamWriter：字符到字節的橋樑。編碼。

流的操作規律：
之所以要弄清楚這個規律，是因為流對像太多，開發時不知道用哪個對象合適。

想要知道開發時用到哪些對象。只要通過四個明確即可。

1. 明確源和目的(匯)
	源：InputStream  Reader
	目的：OutputStream  Writer

2. 明確數據是否是純文本數據。
	源：是純文本：Reader
		否：InputStream
	目的：是純文本 Writer
		否：OutputStream
	
	到這裡，就可以明確需求中具體要使用哪個體系。
	
3. 明確具體的設備。
	源設備：
		硬盤：File
		鍵盤：System.in
		內存：數組
		網絡：Socket流
		
	目的設備：
		硬盤：File
		控制台：System.out
		內存：數組
		網絡：Socket流

4. 是否需要其他額外功能。
	1. 是否需要高效(緩衝區);
		是，就加上buffer.
	2. 轉換。
	


- 需求1：複製一個文本文件。
	1. 明確源和目的。
		源：InputStream Reader
		目的：OutputStream  Writer
	2. 是否是純文本？
		是！
		源：Reader
		目的：Writer
		
	3. 明確具體設備。
		源：
			硬盤：File
		目的：
			硬盤：File
	
		FileReader fr = new FileReader("a.txt");
		FileWriter fw = new FileWriter("b.txt");
		
	4. 需要額外功能嗎？
		需要，需要高效。
		BufferedReader bufr = new BufferedReader(new FileReader("a.txt"));
		BufferedWriter bufw = new BufferedWriter(new FileWriter("b.txt"));
		
---

- 需求2：讀取鍵盤錄入信息，並寫入到一個文件中。
		
	1. 明確源和目的。
		源：InputStream Reader
		目的：OutputStream  Writer
	2. 是否是純文本呢？
		是，
		源：Reader
		目的：Writer
	3. 明確設備
		源：
			鍵盤。System.in
		目的：
			硬盤。File
			
		InputStream in = System.in;
		FileWriter fw = new FileWriter("b.txt");
		這樣做可以完成，但是麻煩。將讀取的字節數據轉成字符串。再由字符流操作。
	4. 需要額外功能嗎？
		需要。轉換。	將字節流轉成字符流。因為名確的源是Reader，這樣操作文本數據做便捷。
			所以要將已有的字節流轉成字符流。使用字節-->字符 。InputStreamReader
		InputStreamReader isr = new InputStreamReader(System.in);
		FileWriter fw = new FileWriter("b.txt");
		
		還需要功能嗎？
		需要：想高效。
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufw = new BufferedWriter(new FileWriter("b.txt"));
		
			
		
===================================================
	
- 需求3：將一個文本文件數據顯示在控制台上。
	1. 明確源和目的。
		源：InputStream Reader
		目的：OutputStream  Writer
	2. 是否是純文本呢？
		是，
		源：Reader
		目的：Writer
	3. 明確具體設備
		源：
			硬盤：File
		目的：
			控制台：System.out
			
		FileReader fr = new FileReader("a.txt");
		OutputStream out = System.out;//PrintStream
		
	4. 需要額外功能嗎？
- 需要,轉換
```
         FileReader fr= new FileReader("a.txt");
         OutputStreamWriter osw = new OutputStreamWriter(System.out);
```  
- 需要,高效 
```
		BufferedReader bufr = new BufferedReader(new FileReader("a.txt"));
		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));
```
		
================================================================

- 需求4：讀取鍵盤錄入數據，顯示在控制台上。

	1. 明確源和目的。
		- 源：InputStream Reader
		- 目的：OutputStream  Writer
	2. 是否是純文本呢？
		是，
		- 源：Reader
		- 目的：Writer
	3. 明確設備。
		- 源：
			鍵盤：System.in
		- 目的：
			控制台：System.out
			
			
		  InputStream in = System.in;
		  OutputStream out = System.out;

   4，明確額外功能？
		需要轉換，因為都是字節流，但是操作的卻是文本數據。
		所以使用字符流操作起來更為便捷。
		
		InputStreamReader isr = new InputStreamReader(System.in);
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		
  為了將其高效。

		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
============================================================

5，將一個中文字符串數據按照指定的編碼表寫入到一個文本文件中.
	1. 目的。OutputStream，Writer
	2. 是純文本，Writer。
	3. 設備：硬盤File 
	
	FileWriter fw = new FileWriter("a.txt");
	fw.write("你好"); 
	
- 注意：既然需求中已經明確了指定編碼表的動作。
	那就不可以使用FileWriter，因為FileWriter內部是使用默認的本地碼表。
	只能使用其父類。OutputStreamWriter.
	OutputStreamWriter接收一個字節輸出流對象，既然是操作文件，那麼該對像應該是FileOutputStream
```
	OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("a.txt"),charsetName);
```
	
- 需要高效嗎？
```
	BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("a.txt"),charsetName));
```

- 什麼時候使用轉換流呢？
	1. 源或者目的對應的設備是字節流，但是操作的卻是文本數據，可以使用轉換作為橋樑。
		提高對文本操作的便捷。
	2. 一旦操作文本涉及到具體的指定編碼表時，必須使用轉換流 。
	










