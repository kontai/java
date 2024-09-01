package com.tai.Socket.Exercise2FileIO.WithThreadPool;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

/**
 * ClassName: myThread
 * Package: com.tai.Socket.Exercise2FileIO.WithThread
 * Description:
 *
 * @Author Kontai
 * @Create 9/1/24 3:05 PM
 * @Version 1.0
 */
public class myThread extends Thread {
    private Socket socket;

    myThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {


        //生成隨機數
        UUID uuid = UUID.randomUUID();

        //將UUID轉換為字串
        String uid = uuid.toString();

        uid = uid.replace("-", "");

//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("IMG/r/myPic.png"));
        try {
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
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
