package com.tai.Socket.Exercise2FileIO.WithThreadPool;

import org.junit.Test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

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
        //創建線程池對象
        int avaliableProcessor = Runtime.getRuntime().availableProcessors();

        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,
//                16,
                avaliableProcessor,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(2),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );


        ServerSocket ss = new ServerSocket(12320);
        while (true) {
            Socket socket = ss.accept();
//            new myThread(socket).start();
            pool.submit(new myThread(socket));

        }
    }


}
