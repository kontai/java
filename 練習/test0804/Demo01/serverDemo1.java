package Demo01;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class serverDemo1 {
    private ServerSocket server;

    public static void main(String[] args)
    {
        serverDemo1 server1=new serverDemo1();
        server1.start();
    }

    public void start()
    {
        try
        {
            server = new ServerSocket(6789);
            receive();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void receive()
    {
        try
        {
            Socket socket = server.accept();
            System.out.println("1 client connected...");
            InputStream input = socket.getInputStream();
            byte[] buff=new byte[1024*1024];
            int len=input.read(buff);
            String str=new String(buff,0,len);
            System.out.println(str);
        } catch (IOException e)
        {
            e.printStackTrace();

        }
    }

    public void stop()
    {

    }
}
