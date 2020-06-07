package 網路編程.ie_server;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		String str_url = "http://192.168.1.100:8080/myweb/1.html";
		
		URL url = new URL(str_url);
		
//		System.out.println("getProtocol:"+url.getProtocol());
//		System.out.println("getHost:"+url.getHost());
//		System.out.println("getPort:"+url.getPort());
//		System.out.println("getFile:"+url.getFile());
//		System.out.println("getPath:"+url.getPath());
//		System.out.println("getQuery:"+url.getQuery());
		
//		InputStream in = url.openStream();
		
		//獲取url對象的Url連接器對象。將連接封裝成了對象:java中內置的可以解析的具體協議的對象+socket.
		URLConnection conn = url.openConnection();
		
//		String value = conn.getHeaderField("Content-Type");
//		System.out.println(value);
		
//		System.out.println(conn);
		//sun.net.www.protocol.http.HttpURLConnection:http://192.168.1.100:8080/myweb/1.html
		
		InputStream in = conn.getInputStream();
		
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		
		String text = new String(buf,0,len);
		
		System.out.println(text);
		
		in.close();
		
		
		
		
		
	}

}
