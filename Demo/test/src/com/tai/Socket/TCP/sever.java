package com.tai.Socket.TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName: sever
 * Package: com.tai.Socket.TCP
 * Description:
 *
 * @Author Kontai
 * @Create 8/30/24 9:00 AM
 * @Version 1.0
 */
public class sever {
    public static void main(String[] args) throws IOException {
        //創建ServerSocket
        ServerSocket ss = new ServerSocket(1221);

        //獲取連接
        Socket socket = ss.accept();

        BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));;


        int b;
        while ((b = br.read()) != -1) {
            System.out.print((char)b);
        }

        ss.close();


    }
}
