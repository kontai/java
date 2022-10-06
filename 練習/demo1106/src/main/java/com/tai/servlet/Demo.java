package com.tai.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@WebServlet("/demo")
        public class Demo extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                ServletOutputStream os = resp.getOutputStream();
        InputStream is=new FileInputStream(new File(getServletContext().getRealPath("image"),"img.png" ));
        int index=-1;
        while((index=is.read())!=-1){
            os.write(index);
        }

//        super.service(req, resp);
    }
}
