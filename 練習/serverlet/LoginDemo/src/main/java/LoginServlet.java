import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String status=req.getAttribute("st")==null?"": (String) req.getAttribute("st");

        resp.setContentType("text/html; charset=UTF-8");
        resp.getWriter().write("<html>");
        resp.getWriter().write("<head>");
        resp.getWriter().write("</head>");
        resp.getWriter().write("<body>");

        resp.getWriter().write("<span style='color:red;font size:20px'>"+status+"</span>");
        resp.getWriter().write("<form action='page' method='get'>");
        resp.getWriter().write("名稱<input type=text name='uname'></br>");
        resp.getWriter().write("密碼<input type=text name='pwd'></br>");
        resp.getWriter().write("<input type=submit value='提交'></br>");
        resp.getWriter().write("</form>");
        resp.getWriter().write("</body>");
        resp.getWriter().write("</html>");
//        super.service(req, resp);
    }
    //    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

}

