package src.com.kontai.udpDemo;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

/**
 * @author kontai
 */
public class recent01 {
    public static void main(String[] args) throws SocketException
    {
        //建立UDP服務
        DatagramSocket sc = new DatagramSocket(9123);
        byte[] buf = new byte[1024];
        DatagramPacket data;
        data = new DatagramPacket(buf, buf.length);
        System.out.println("service is running....");
        while (true)
        {
            try
            {
                sc.receive(data);
                //                byte[] text=data.getData();
                String str = new String(data.getData(), 0, data.getLength(), StandardCharsets.UTF_8).trim();
                System.out.println(str);
                if (str.equals("886"))
                {
                    break;
                }
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        if (sc != null)
        { sc.close(); }
    }

}
