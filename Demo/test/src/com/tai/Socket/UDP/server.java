package com.tai.Socket.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;

/**
 * ClassName: server
 * Package: com.tai.Socket.UDP
 * Description:
 *
 * @Author Kontai
 * @Create 8/30/24 12:59 AM
 * @Version 1.0
 */
public class server {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket(10085);

        byte[] bytes=new byte[1024];
        DatagramPacket packet=new DatagramPacket(bytes,bytes.length);

        System.out.println("開始接收");
        ds.receive(packet);
        System.out.println("接收完畢");

        byte[] data=packet.getData();
        int len = packet.getLength();
        int port=packet.getPort();
        System.out.println(new String(data,0,len));
        System.out.println("接收的地址是:"+packet.getAddress());
        System.out.println("接收的端口是:"+packet.getPort());

        ds.close();

    }
}
