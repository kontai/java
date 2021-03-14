//package InetDemo;

//import jdk.jfr.StackTrace;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;
import java.util.ArrayList;

public class send01 {
    public static void main(String[] args) throws IOException
    {
//        InetAddress inet = getAddr();
        DatagramSocket client=new DatagramSocket(6666);
//        double[] db={1.2,2.3,3.4,4.5};
//        StringBuilder sb = getString(db);
        System.out.printf("發送!");
        String str=new String("1.2 3.4");


        byte[] db=str.getBytes();
        InetAddress host=getAddr();
        DatagramPacket pack=new DatagramPacket(db,0, db.length , host,9100);
        client.send(pack);
        System.out.printf("完成發送");
        client.close();

    }

    private static StringBuilder getString(double[] db)
    {
        StringBuilder sb=new StringBuilder();
        for(double d:db){
                  sb.append(d);
                  sb.append(' ');
        }
        System.out.println(sb);
        System.out.println(sb.length());
        return sb;
    }

    private static InetAddress getAddr() throws UnknownHostException
    {
        InetAddress inet= InetAddress.getByName("localhost");
//        System.out.println(inet.getHostName());
//        System.out.println(inet.getHostAddress());
        return inet;
    }
}
