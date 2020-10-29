import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PageServlet")
public class PageServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        resp.setContentType("text/html; charset=UTF-8");
        resp.getWriter().write("<html>");
        resp.getWriter().write("<head>");
        resp.getWriter().write("</head>");
        resp.getWriter().write("<body>");
        resp.getWriter().write("<form action='login' method=''>");
        resp.getWriter().write("用戶名:<input type='text' name='uname'>");
        resp.getWriter().write("密碼:<input type='password' name='pwd'>");
        resp.getWriter().write("<input type='submit' value='提交'>");
        resp.getWriter().write("</form>");
        resp.getWriter().write("</body>");
        resp.getWriter().write("</html>");
    }
}
