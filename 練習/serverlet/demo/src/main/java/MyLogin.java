import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

public class MyLogin extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //獲取請求數據
        System.out.println("Mehod:" + req.getMethod());
        System.out.println("Request URL:" + req.getRequestURL());
        System.out.println("Request URI:" + req.getRequestURI());
        /*
        Enumeration<String> headers = req.getHeaderNames();
        while (headers.hasMoreElements()) {
            String name = headers.nextElement();
            System.out.println(name);
        }
         */
        System.out.println("uname="+req.getParameter("uname"));
        System.out.println("password="+req.getParameter("pwd"));


        //發起響應
        resp.setContentType("text/html;charset=utf-8");
    }
}
