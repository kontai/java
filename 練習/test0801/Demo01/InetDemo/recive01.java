package InetDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class recive01 {
    public static void main(String[] args) throws IOException
    {
        DatagramSocket server=new DatagramSocket(9100);
        System.out.println("接收!");

        byte[] db=new byte[1024];
        DatagramPacket pack=new DatagramPacket(db,0,db.length);
        server.receive(pack);
        System.out.println(new String(pack.getData(),0,pack.getLength()));
        System.out.println("完成接收");
        server.close();

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
