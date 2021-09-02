package com.tai.Demo0710.MyServlet.number;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;

public class numberServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        //獲取資源路徑
        String path = this.getServletContext().getRealPath("/number/number.txt");

        //文件流(讀取存檔)
        FileReader fi = null;
        BufferedReader br = null;
        System.out.println("init() is called~");
        try {
            fi = new FileReader(path);
            br = new BufferedReader(fi);
            String num = br.readLine();
            System.out.println("num=" + num);
            this.getServletContext().setAttribute("number", num);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fi.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public void destroy() {
        FileWriter fo = null;
        BufferedWriter bw = null;
//        String path = this.getServletContext().getRealPath("/number/number.txt");

        File file = new File("src/webapp/number/number.txt");

        int num = (int) this.getServletContext().getAttribute("number");
        System.out.println("destroy is called... \n num=" + num);
        try {
            fo = new FileWriter(file);
            bw = new BufferedWriter(fo);
            bw.append(num + "");
            bw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                fo.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
