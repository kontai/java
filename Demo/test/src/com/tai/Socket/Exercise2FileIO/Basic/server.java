package com.tai.Socket.Exercise2FileIO.Basic;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

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
        ServerSocket ss = new ServerSocket(13220);

        Socket socket = ss.accept();

        //創建文件對象
//        File dir = new File("IMG/r");
//        if (!dir.isDirectory()) {
//            dir.mkdirs();
//        }
//        BufferedWriter bfw = new BufferedWriter(new FileWriter(new File(dir, "myPic.png")));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("IMG/r/myPic.png"));
        BufferedInputStream bfi = new BufferedInputStream(socket.getInputStream());

        byte[] bytes = new byte[1024];
        int len;

        while ((len = bfi.read(bytes)) != -1) {
            System.out.println(bytes);
            bos.write(bytes, 0, len);
        }

//        socket.shutdownInput();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("文件上傳成功");
        bw.newLine();
        bw.flush();


        socket.close();
        ss.close();


    }
}
