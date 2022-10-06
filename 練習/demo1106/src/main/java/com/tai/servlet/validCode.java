package com.tai.servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@WebServlet("/validCode")
public class validCode extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //創建圖紙
        BufferedImage img=new BufferedImage(200,100,BufferedImage.TYPE_INT_RGB);
//        super.service(req, resp);
        Graphics2D graph = img.createGraphics();
        //埴滿顏色
        graph.setColor(Color.WHITE);
        graph.fillRect(0,0,200,100);
        List<Integer> randList=new ArrayList<>();
        Random random=new Random();
        for(int i=0;i<4;i++){
            randList.add(random.nextInt(10));
        }
        Color[] colors =new Color[]{Color.RED,Color.BLUE,Color.GREEN,Color.CYAN,Color.BLACK};
        for ( int i=0; i <randList.size();i++) {
            graph.setFont(new Font("Arial",Font.BOLD|Font.ITALIC,30+random.nextInt(30)));
            graph.setColor(colors[random.nextInt(colors.length)]);
            graph.drawString("" + randList.get(i), i*50, 50+random.nextInt(50));

        }
        graph.setColor(colors[random.nextInt(colors.length)]);
        graph.drawLine(0,random.nextInt(100),200,30+random.nextInt(40));
        ServletOutputStream out=resp.getOutputStream();
        //輸出流
        ImageIO.write(img,"jpg",out);
        HttpSession session= req.getSession();

        String str=""+ randList.get(0)+randList.get(1)+randList.get(2)+randList.get(3);
        session.setAttribute("code",str);

    }
}

