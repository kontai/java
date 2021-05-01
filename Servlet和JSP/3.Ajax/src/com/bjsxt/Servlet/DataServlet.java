package com.bjsxt.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bjsxt.service.UserSrevice;
import com.bjsxt.serviceImp.UserSeviceImp;
import com.bjsxt.vo.Area;
import com.google.gson.Gson;
@WebServlet("/data")
public class DataServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//������������ʽ
			req.setCharacterEncoding("utf-8");
		//������Ӧ�����ʽ
			resp.setCharacterEncoding("utf-8");
			resp.setContentType("text/html;charset=utf-8");
		//��ȡ��������
			String pid=req.getParameter("pid");
			System.out.println(pid);
		//������������
			UserSrevice us=new UserSeviceImp();
			List<Area> list=us.getAreaInfoService(pid);
			System.out.println(list);
		//��Ӧ������
			resp.getWriter().write(new Gson().toJson(list));
		
		
	}
}
