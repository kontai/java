package com.tai.Socket.Exercise1;

import cn.hutool.core.date.DateTime;
import org.junit.runners.model.FrameworkField;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDate;
import java.util.Date;

/**
 * ClassName: server
 * Package: com.tai.Socket.Exercise1
 * Description:
 *
 * @Author Kontai
 * @Create 8/31/24 12:05 AM
 * @Version 1.0
 */
public class server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10023);
        Socket socket = ss.accept();

        //獲取輸入流
        InputStream ins = socket.getInputStream();
        System.out.println("Server start.");

        BufferedReader bfr = new BufferedReader(new InputStreamReader(ins));

        Date date1 = new Date();

        String line;

        int hours;
        int minutes;
        int seconds;
        hours = date1.getHours();
        minutes = date1.getMinutes();
        seconds = date1.getSeconds();
        String time = String.format("%02d:%02d:%02d", hours, minutes, seconds);

        int i;

        //使用getline方法獲取輸入流
        while ((line = bfr.readLine()) != null) {
            System.out.println(line);
        }
//        while ((i = bfr.read()) != -1) {
//            System.out.print((char)i);
//        }
        bfr.close();
        ins.close();

        System.out.println("Server stop");

    }
}
