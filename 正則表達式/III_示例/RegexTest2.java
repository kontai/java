package 正則表達式.III_示例;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/*
 * 網頁爬蟲：其實就一個程序用於在互聯網中獲取符合指定規則的數據。
 *
 * 爬取郵箱地址。
 *
 */
public class RegexTest2 {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {


		List<String> list = getMailsByWeb();

		for(String mail : list){
			System.out.println(mail);
		}
	}

	public static List<String> getMailsByWeb() throws IOException {

		//1,讀取源文件。
//				BufferedReader bufr = new BufferedReader(new FileReader("c:\\mail.html"));

		URL url = new URL("http://192.168.1.100:8080/myweb/mail.html");

		BufferedReader bufIn = new BufferedReader(new InputStreamReader(url.openStream()));

		//2,對讀取的數據進行規則的匹配。從中獲取符合規則的數據.
		String mail_regex = "\\w+@\\w+(\\.\\w+)+";

		List<String> list = new ArrayList<String>();


		Pattern p = Pattern.compile(mail_regex);

		String line = null;

		while((line=bufIn.readLine())!=null){

			Matcher m = p.matcher(line);
			while(m.find()){
				//3,將符合規則的數據存儲到集合中。
				list.add(m.group());
			}

		}
		return list;
	}

	public static List<String>  getMails() throws IOException{

		//1,讀取源文件。
		BufferedReader bufr = new BufferedReader(new FileReader("c:\\mail.html"));

		//2,對讀取的數據進行規則的匹配。從中獲取符合規則的數據.
		String mail_regex = "\\w+@\\w+(\\.\\w+)+";

		List<String> list = new ArrayList<String>();


		Pattern p = Pattern.compile(mail_regex);

		String line = null;

		while((line=bufr.readLine())!=null){

			Matcher m = p.matcher(line);
			while(m.find()){
				//3,將符合規則的數據存儲到集合中。
				list.add(m.group());
			}

		}
		return list;

	}

}
