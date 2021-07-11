package com.tai.Service;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.util.Collection;
import java.util.Iterator;

/**
 * init() and destroy() setting servlet
 */
@WebServlet(name = "WebParameter", value = "/WebParameter", loadOnStartup = 1)
public class WebParameter extends HttpServlet {
    @Override
    public void init() throws ServletException {
//        super.init();
        InputStream in = null;
        BufferedReader br = null;
        FileReader file = null;
        try {
            String path = this.getServletContext().getRealPath("/Data/count.txt");
//            in = this.getServletContext().getResourceAsStream(path);
            file = new FileReader(path);
            br = new BufferedReader(file);
            String count = br.readLine();
            System.out.println("In Init() count=" + count);
            this.getServletContext().setAttribute("count", Integer.parseInt(count));
        } catch (NullPointerException | IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void destroy() {
        System.out.println("Destroy is called");
//        super.destroy();
        /*
        FileWriter out = null;
        BufferedWriter bw = null;
        try {
            String count = (String) this.getServletContext().getAttribute("count");
            System.out.println("In Destroy() count=" + count);
            String path = this.getServletContext().getRealPath("/Data/count.txt");
            out = new FileWriter(path);
            bw = new BufferedWriter(out);
            bw.write(Integer.parseInt(count));
            bw.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

         */

    }
    //    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
}
