import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        resp.getWriter().write("login page");
        resp.setContentType("text/html; charset=UTF-8");
        String uname = req.getParameter("uname");
        String pwd = req.getParameter("pwd");
        System.out.println(uname+":"+pwd);
    }
}
