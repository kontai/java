import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.net.http.HttpRequest;
import java.util.Date;

/**
 * The type Server.
 */
public class Server {
    private ServerSocket server;

    public static void main(String[] args)
    {
        Server server1 = new Server();
        server1.start();


    }

    private void start()
    {
        try
        {
            server = new ServerSocket(6789);
            Socket socket = server.accept();
            System.out.println("clent connected....");

            InputStream in = socket.getInputStream();
            //            InputStreamReader is=new InputStreamReader(in,"UTF-8");
            byte[] buff = new byte[1024 * 1024];
            int len = in.read(buff);
            String serverInfo = new String(buff, 0, len);
            System.out.println(serverInfo);
            respon(socket);
            release(server, socket);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /*
    === 服务器应答 ===
<syntaxhighlight lang="http">
HTTP/1.1 200 OK
Content-Length: 3059
Server: GWS/2.0
Date: Sat, 11 Jan 2003 02:44:04 GMT
Content-Type: text/html
Cache-control: private
Set-Cookie: PREF=ID=73d4aef52e57bae9:TM=1042253044:LM=1042253044:S=SMCc_HRPCQiqy
X9j; expires=Sun, 17-Jan-2038 19:14:07 GMT; path=/; domain=.google.com
Connection: keep-alive
</syntaxhighlight>

（紧跟着一个空行，并且由HTML格式的文本组成了Google的主页）

在HTTP1.0，单一TCP连接内仅执行一个“客户端发送请求—服务器发送应答”周期，之后释放TCP连接。在HTTP1.1优化支持持续活跃连接：客户端连续多次发送请求、接收应答；批次多请求时，同一TCP连接在活跃（Keep-Live）间期内复用，避免重复TCP初始握手活动，减少网络负荷和响应周期。此外支持应答到达前继续发送请求（通常是两个），称为「流线化」（stream）。

     */
    private void respon(Socket socket)
    {
        final String BLANK = " ";     //空格
        final String CRCF = "\r\n";   //空行

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

        StringBuilder respheader = new StringBuilder();
        respheader.append("HTTP/1.1").append(BLANK);
        respheader.append("200").append(BLANK);
        respheader.append("OK").append(CRCF);
        respheader.append("Server:").append("TESTserver/1.0").append(CRCF);
        respheader.append("Date:").append(new Date().toString()).append(CRCF);
        respheader.append("Content-Type:text/html;charset=utf-8").append(CRCF);
        respheader.append("Content-Length:").append(size).append(CRCF);
        respheader.append(CRCF);

        respheader.append(content);

        try
        {
            BufferedWriter bfw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bfw.write(respheader.toString());
            bfw.flush();
            bfw.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    private static void release(ServerSocket server, Socket socket) throws IOException
    {
        socket.close();
        server.close();
    }

}