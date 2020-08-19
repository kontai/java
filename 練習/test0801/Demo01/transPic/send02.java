package transPic;

import org.w3c.dom.ranges.Range;


//import java.awt.*;
//import java.awt.image.BufferedImage;
//import java.awt.image.ColorModel;
import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class send02 {

    public static void main(String[] args) throws IOException
    {
        File file=new File("練習\\test0801\\Demo01\\transPic\\logo.png");

        sendFunc(file);



    }

    private static void sendFunc(File file) throws IOException,MAXLenthException
    {
        System.out.printf("發送!");

        InputStream pic = new FileInputStream(file);
        BufferedInputStream bufs = new BufferedInputStream(pic);

        //        InetAddress inet = getAddr();
        DatagramSocket client = new DatagramSocket(6666);


        byte[] buff = bufs.readAllBytes();

        final int MAXLenth=1024*64;

        if(buff.length>MAXLenth)
        {
            throw new MAXLenthException();
        }

        InetAddress host = getAddr();
        DatagramPacket pack = new DatagramPacket(buff, 0, buff.length, host, 9100);
        try
        {
            client.send(pack);
        } catch (IOException e)
        {
            System.out.println("errrrr");
            e.printStackTrace();
        }
        System.out.printf("完成發送");
        client.close();

        bufs.close();
        pic.close();
    }

    private static StringBuilder getString(double[] db)
    {
        StringBuilder sb = new StringBuilder();
        for (double d : db)
        {
            sb.append(d);
            sb.append(' ');
        }
        System.out.println(sb);
        System.out.println(sb.length());
        return sb;
    }

    private static InetAddress getAddr() throws UnknownHostException
    {
        InetAddress inet = InetAddress.getByName("localhost");
        //        System.out.println(inet.getHostName());
        //        System.out.println(inet.getHostAddress());
        return inet;
    }
}
