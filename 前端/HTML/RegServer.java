package HTML;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class RegServer {
    public static void main(String[] args) throws IOException
    {
        ServerSocket sv=new ServerSocket(10222);

        Socket sc=sv.accept();

        System.out.println(sc.getInetAddress().getHostAddress());

        InputStream in=sc.getInputStream();


        byte[] b=new byte[1024];
        int len=in.read(b);
//        int len=0;
//        while((len=in.read(b))!=-1)
        System.out.printf(new String(b,0,len));

        PrintWriter pt=new PrintWriter(sc.getOutputStream(),true);
        pt.println("<font color='green' size='7'>註冊成功</font>");
        pt.close();
        in.close();


    }
}
