package pa01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class gogo {
    public static void main(String[] args) throws IOException
    {
        URL url = new URL("https://www.yahoo.com.tw");

        //        Connet01(url);
        newConnet(url);

        return;


    }

    private static void newConnet(URL url) throws IOException
    {
        HttpURLConnection connect = (HttpURLConnection) url.openConnection();
        connect.setRequestMethod("GET");
        connect.setRequestProperty("User-Agent", "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.105 Mobile Safari/537.36"
        );
        InputStream in = connect.getInputStream();
        BufferedReader read = new BufferedReader(new InputStreamReader(in, "UTF-8"));
        String str = null;
        while ((str = read.readLine()) != null)
        {

            System.out.println(str);
        }
        read.close();

    }

    private static void Connet01(URL url) throws IOException
    {
        InputStream in = url.openStream();
        BufferedReader read = new BufferedReader(new InputStreamReader(in, "UTF-8"));
        String str = null;
        while ((str = read.readLine()) != null)
        {

            System.out.println(str);
        }
        read.close();
    }

}
