package src.com.kontai.server1;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class server1 {
    public static void main(String[] args) throws IOException
    {
        ServerSocket server = new ServerSocket(6789);
        Socket socket = server.accept();

        System.out.println(server.getInetAddress().getHostAddress()+"....connected");

        InputStream in=socket.getInputStream();
        byte[] buf=new byte[1024];
        int len=in.read(buf);
        String text=new String(buf,0,buf.length);

    }

}
