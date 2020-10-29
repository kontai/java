package src.com.kontai.udpDemo;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

public class Send01 {
    public static void main(String[] args) throws IOException
    {
        DatagramSocket sc = new DatagramSocket(9991);
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while(true)
        {
            str=bfr.readLine().trim();
            DatagramPacket packet = new DatagramPacket(str.getBytes(StandardCharsets.UTF_8), str.length(), InetAddress.getByName("localhost"), 9123);
            sc.send(packet);
            if(str.equals("886"))
                break;
        }
        System.out.println("success....");
    }
}
