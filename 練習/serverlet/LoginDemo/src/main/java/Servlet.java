import com.kontai.LoginJDBC.LoginServerImp;
import com.kontai.LoginJDBC.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        //獲取請求數據
        String uname=req.getParameter("uname");
        String pwd=req.getParameter("pwd");
        uname=new String(uname.getBytes("iso-8859-1"),"utf-8");
//        System.out.println("使用者姓名:"+uname);
//        System.out.println("使用者密碼:"+pwd);

        //與資料庫建立通訊
        LoginServerImp login=new LoginServerImp();
        User u=login.LoginCheck(uname,pwd);
        if (u!=null){
            resp.getWriter().write("登陸成功");
        }else{
//            resp.getWriter().write("登陸失敗");
            //登陸失敗,跳轉回登陸頁面
            req.setAttribute("st","username or password fail.");
            req.getRequestDispatcher("login").forward(req,resp);
        }
        System.out.println(u.getUname()+u.getPwd());
//        resp.getWriter().write("成功開啟");
        System.out.println(req.getParameter("uname")+req.getParameter("pwd")+"已經登入");
//        super.service(req, resp);
    }
    //    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
}
