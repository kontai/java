package com.tai.servlet;

import com.tai.service.PageInfoService;
import com.tai.service.PageInfoServiceImpl;

import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "showPage", value = "/page")
public class showPage extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PageInfoService service=new PageInfoServiceImpl();
        int pageSize=2;
        String pageSizeStr=req.getParameter("pageSize");
        if(pageSizeStr!=null && !pageSizeStr.equals("")){
            pageSize=Integer.parseInt(pageSizeStr);
        }
        int pageNumber=1;
        String pageNumberStr=req.getParameter("pageNumber");
        if(pageNumberStr!=null&&!pageNumberStr.equals("")){
            pageNumber= Integer.parseInt(pageNumberStr);
        }
        req.setAttribute("page",service.showPage(pageSize,pageNumber));
        req.getRequestDispatcher("/log.jsp").forward(req,resp);

    }
}
