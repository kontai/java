package transPic;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class recive02 {
    public static void main(String[] args) throws IOException
    {
        File file= null;
        try
        {
            file = new File("練習\\test0801\\Demo01\\transPic\\logo2.png");
            recivedFunc(file);
        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    private static void recivedFunc(File file) throws IOException
    {

        DatagramSocket server=new DatagramSocket(9100);
        System.out.println("接收!");

//        BufferedOutputStream out=new BufferedOutputStream(new FileOutputStream(file));
        OutputStream out=new FileOutputStream(file);
        byte[] buff=new byte[1024*200];

        DatagramPacket pack=new DatagramPacket(buff,buff.length);
        server.receive(pack);
        out.write(pack.getData());
//        new BufferedOutputStream(new FileOutputStream(file)).write(pack.getData());

//        System.out.println(new String(pack.getData(),0,pack.getLength()));
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
