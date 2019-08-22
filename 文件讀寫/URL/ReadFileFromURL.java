package 文件讀寫.URL;

import java.net.MalformedURLException;
import java.util.Scanner;

public class ReadFileFromURL {
    public static void main(String[] args) {
        try {
            java.net.URL url = new java.net.URL("https://www.yahoo.com.tw");
            Scanner input = new Scanner(url.openStream());
            int count = 0;
            while (input.hasNext()) {
                String line=input.nextLine();
                System.out.println(line);
                count += 1;
            }
            System.out.println("The file size is " + count+" characters");
        } catch (MalformedURLException ex) {   //catch網址格式錯誤
            ex.printStackTrace();
        } catch (java.io.IOException ex) {      //catch不存在的網址
            ex.printStackTrace();
        }
    }
}
