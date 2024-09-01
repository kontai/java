package com.tai.Socket.Exercise2FileIO.FileNameUUID;

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

        ServerSocket ss = new ServerSocket(13220);

        Socket socket = ss.accept();


        //生成隨機數
        UUID uuid = UUID.randomUUID();

        //將UUID轉換為字串
        String uid = uuid.toString();

        uid = uid.replace("-", "");

//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("IMG/r/myPic.png"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("IMG/r/" + uid + ".png"));
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

    @Test
    public void test() {
    }
}
