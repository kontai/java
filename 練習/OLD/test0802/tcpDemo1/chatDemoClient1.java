import java.io.*;
import java.net.Socket;

public class chatDemoClient1 {
    public static void main(String[] args) throws IOException
    {
        System.out.println("客戶端啟動");
        Socket client = new Socket("localhost", 6666);

        DataOutputStream dout = new DataOutputStream(new BufferedOutputStream(client.getOutputStream()));
        DataInputStream din = new DataInputStream(new BufferedInputStream(client.getInputStream()));

        boolean isRunning = true;


        while (isRunning)
        {
            new Thread(()->{

                String msg = null;
                BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
                try
                {
                    dout.writeUTF(msg);
                    dout.flush();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }

                try
                {
                    msg = din.readUTF();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
                System.out.println(msg);
                try
                {
                    msg = read.readLine();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }

            }
            ).start();


    }

        din.close();
        dout.flush();
        dout.close();
        client.close();

}
}
