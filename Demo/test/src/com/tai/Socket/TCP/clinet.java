package com.tai.Socket.TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * ClassName: clinet
 * Package: com.tai.Socket.TCP
 * Description:
 *
 * @Author Kontai
 * @Create 8/30/24 8:50 AM
 * @Version 1.0
 */
public class clinet {
    public static void main(String[] args) throws IOException {
        //倉創Socket對象,創建的同時就連接服務器,如果連接不上，就會拋出異常
        Socket socket=new Socket("localhost",1221);

//        socket.connect(new InetSocketAddress("localhost",1000));
        //獲取輸出流
        OutputStream os = socket.getOutputStream();

        //發送數據
        os.write("你好你好".getBytes());
        os.write("abc".getBytes());
        System.out.println("發送完畢");

        //關閉資源
        socket.close();
    }
}
