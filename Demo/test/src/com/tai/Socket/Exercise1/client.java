package com.tai.Socket.Exercise1;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * ClassName: client
 * Package: com.tai.Socket.Exercise1
 * Description:
 *
 * @Author Kontai
 * @Create 8/30/24 11:40 PM
 * @Version 1.0
 */
public class client {
    /**
     * 無限傳輸`1
     */

    public static void main(String[] args) throws IOException {

        Socket socket=new Socket("localhost",10023);
        OutputStream out = socket.getOutputStream();
        byte[] bytes=new byte[1024];

        Scanner in = new Scanner(System.in);

        String str=null;


        //錄入數擄
        while(true) {
            System.out.println("請輸入: ");
            str=in.nextLine();
            if(str.equals("886")){
                break;
            }
            out.write(str.getBytes());

/*
            bytes=in.nextLine().getBytes();
            if (new String(bytes).equals("exit")) {
                break;
            }
            out.write(bytes);
*/
        }

        socket.close();


    }

}
