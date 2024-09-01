package com.tai.Socket.Exercise2FileIO.Basic;

import java.io.*;
import java.net.Socket;

/**
 * ClassName: clinet
 * Package: com.tai.Socket.Exercise2FileIO
 * Description:
 *
 * @Author Kontai
 * @Create 9/1/24 10:49 AM
 * @Version 1.0
 */
public class clinet {
    public static void main(String[] args) throws IOException {
        //建立socket對象
        Socket socket=new Socket("localhost",13220);

        //獲取輸出流

        //讀取資源
        BufferedInputStream bfi=new BufferedInputStream(new FileInputStream("IMG/myPic.png"));

        BufferedOutputStream bos=new BufferedOutputStream(socket.getOutputStream());

        byte[] bytes=new byte[1024];

        int len;

        while((len=bfi.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }


        //往服務器寫出標記
        socket.shutdownOutput();


        //獲取伺服器回應
        BufferedReader bfr=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String str = bfr.readLine();
        System.out.println(str);


        socket.close();

    }
}
