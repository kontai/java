package com.tai.Socket.Exercise2FileIO.WithThread;

import org.junit.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

/**
 * ClassName: server
 * Package: com.tai.Socket.Exercise2FileIO
 * Description:
 *
 * @Author Kontai
 * @Create 9/1/24 11:06 AM
 * @Version 1.0
 */
public class server {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(12320);
        while (true) {
            Socket socket=ss.accept();
            new myThread(socket).start();

        }
    }

}
