import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class chatDemoServer {
    public static void main(String[] args) throws IOException
    {
        System.out.println("服務端啟動");
        ServerSocket server = new ServerSocket(6666);
        Socket sv = server.accept();
        DataInputStream din = new DataInputStream(new BufferedInputStream(sv.getInputStream()));
        DataOutputStream dout = new DataOutputStream(new BufferedOutputStream(sv.getOutputStream()));

        boolean isRunning = true;
        String msg = null;

        while (isRunning)
        {
            msg = din.readUTF();
            dout.writeUTF(msg);
            dout.flush();
        }


        dout.close();
        din.close();

        sv.close();
        server.close();

    }
}
