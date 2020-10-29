import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MyServlet")
public class MyServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        resp.getWriter().write("This is my first sevlet");
        System.out.println("This is my first sevlet.");
        //        super.service(req, resp);
    }

    //    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    //    {
    //    }
    //
    //    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    //    {
    //
    //    }
}
