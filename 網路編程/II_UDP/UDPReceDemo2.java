package 網路編程.II_UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;

public class UDPReceDemo2 {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException
    {

        System.out.println("接收端啟動......");
        /*
         * 建立UDP接收端的思路。
         * 1，建立udp socket服務,因為是要接收數據，必須要明確一個端口號。
         * 2，創建數據包，用於存儲接收到的數據。方便用數據包對象的方法解析這些數據.
         * 3，使用socket服務的receive方法將接收的數據存儲到數據包中。
         * 4，通過數據包的方法解析數據包中的數據。
         * 5，關閉資源
         */

        //1,建立udp socket服務。
        DatagramSocket ds = new DatagramSocket(10000);

        while (true)
        {

            //2,創建數據包。
            byte[] buf = new byte[1024];
            DatagramPacket dp = new DatagramPacket(buf, buf.length);

            //3,使用接收方法將數據存儲到數據包中。
            ds.receive(dp);//阻塞式的。

            //4，通過數據包對象的方法，解析其中的數據,比如，地址，端口，數據內容。
            String ip = dp.getAddress().getHostAddress();
            int port = dp.getPort();
            String text = new String(dp.getData(), 0, dp.getLength());

            System.out.println(ip + ":" + port + ":" + text);


        }
        //5,關閉資源。
//		ds.close();


    }


}
