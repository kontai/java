package com.tai.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;

@WebServlet(name = "ServerStatusServlet", value = "/ServerStatusServlet", loadOnStartup = 1)
public class ServerStatusServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
//        FileReader file = null;
        BufferedReader br = null;
        InputStreamReader isr = new InputStreamReader(getClass().getResourceAsStream("/count.txt"));

//        String path = this.getServletContext().getRealPath("/doc/count.txt");
//        System.out.println("dynamic fetch path=" + path);
        try {
//            file = new FileReader(path);
            br = new BufferedReader(isr);
            int num = Integer.parseInt(br.readLine());
            ServletContext sc = this.getServletContext();
            sc.setAttribute("num", num);
            System.out.println("初始化:");
            System.out.println("獲取瀏覽人數:" + num);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                isr.close();
//                file.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    @Override
    public void destroy() {
        ServletContext sc = this.getServletContext();
        String num = (String) sc.getAttribute("num");
        FileWriter file = null;
        BufferedWriter bw = null;

//        String path = this.getServletContext().getRealPath("/doc/count.txt");

        OutputStreamWriter osw=null;
        try {

            String path= String.valueOf(getServletContext().getResource("/count.txt"));
            file=new FileWriter(String.valueOf(getServletContext().getResource("/count.txt")));
            bw = new BufferedWriter(file);
            bw.write(num);
            bw.flush();
            System.out.println("path="+path);
//            System.out.println("檔案寫入成功!");

        } catch (IOException ex) {
            throw new RuntimeException(ex);

        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                file.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("server disconnected , 瀏覽人數已儲存.");

        super.destroy();
    }
}
