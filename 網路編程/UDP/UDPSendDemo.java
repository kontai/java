package 網路編程.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPSendDemo {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException
    {

        System.out.println("發送端啟動......");
        /*
         * 創建UDP傳輸的發送端。
         * 思路：
         * 1，建立udp的socket服務。
         * 2，將要發送的數據封裝到數據包中。
         * 3，通過udp的socket服務將數據包發送出去。
         * 4，關閉socket服務。
         */
        //1,udpsocket服務。使用DatagramSocket對象。
        DatagramSocket ds = new DatagramSocket(1234);

        //2,將要發送的數據封裝到數據包中。
        String str = "udp傳輸演示：哥們來了！";
        //使用DatagramPacket將數據封裝到的該對像包中。
        byte[] buf = str.getBytes();

        DatagramPacket dp =
                new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.1.100"), 10000);


        //3，通過udp的socket服務將數據包發送出去。使用send方法。
        ds.send(dp);

        //4，關閉資源。
        ds.close();


    }

}
