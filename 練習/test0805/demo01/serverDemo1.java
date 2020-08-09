import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class serverDemo1 {
    private ServerSocket server;

    public static void main(String[] args)
    {
        serverDemo1 server1 = new serverDemo1();
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
            //接收
            Socket socket = server.accept();
            System.out.println("1 client connected...");
            InputStream input = socket.getInputStream();


            byte[] buff = new byte[1024 * 1024];
            int len = input.read(buff);

            String str = new String(buff, 0, len);
            System.out.println(str);

            StringBuilder content = new StringBuilder();
            content.append("<html>");
            content.append("<head>");
            content.append("<title>");
            content.append("服務器成功響應");
            content.append("</title/>");
            content.append("</head>");
            content.append("<body>");
            content.append("<div>終於有回應了....</div>");
            content.append("</body>");
            content.append("</html>");
            int size = content.toString().getBytes().length;

            StringBuilder responseInfo = new StringBuilder();
            String blank = " ";
            String CRLF = "\r\n";

            //1.響應行:HTTP/1.1 200 OK
            responseInfo.append("HTTP/1.1").append(blank);
            responseInfo.append(200).append(blank);
            responseInfo.append("OK").append(CRLF);

            //2.響應頭:
            /*
            Date: Mon, 18 Jul 2016 16:06:00 GMT
            Content-Type: text/html; charset=utf-8
            Content-length:39725426
             */

            responseInfo.append("Date").append(new Date()).append(CRLF);
            responseInfo.append("Server:").append("shsxt Server/0.0.1;charset=GBK").append(CRLF);
            responseInfo.append("Content-type:").append("text/html; charset=utf-8").append(CRLF);
            responseInfo.append("Content-length:").append(size).append(CRLF);
            responseInfo.append(CRLF);

            //3.正文
            responseInfo.append(content.toString());

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write(responseInfo.toString());
            bw.flush();


            //返回


        } catch (IOException e)
        {
            e.printStackTrace();

        }
    }

    public void stop()
    {

    }
}
