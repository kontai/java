package com.tai.Socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * ClassName: demo
 * Package: com.tai.Socket
 * Description:
 *
 * @Author Kontai
 * @Create 8/29/24 10:47 AM
 * @Version 1.0
 */
public class demo {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress address = InetAddress.getByName("localhost");
        System.out.println(address);

        String hostName = address.getHostName();
        System.out.println(hostName);

        String hostAddress = address.getHostAddress();
        System.out.println(hostAddress);
    }
}
