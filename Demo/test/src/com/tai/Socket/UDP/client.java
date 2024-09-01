package com.tai.Socket.UDP;

import java.io.IOException;
import java.net.*;

/**
 * ClassName: client
 * Package: com.tai.Socket.UDP
 * Description:
 *
 * @Author Kontai
 * @Create 8/29/24 11:10 AM
 * @Version 1.0
 */
public class client {
    public static void main(String[] args) throws IOException {
        //建立資源 , 創建對象
        DatagramSocket ds=new DatagramSocket();

        //打包數據
        String str="哈囉～";
        byte[] bytes=str.getBytes();
        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port=10085;

        DatagramPacket packet=new DatagramPacket(bytes,bytes.length,address,port);

        //發送資源
        ds.send(packet);

        //釋放資源
        ds.close();




    }
}
