package com.bjsxt.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TestServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//��ȡ������Ϣ
		//����������Ϣ
			req.setAttribute("str","request������������");
			HttpSession hs=req.getSession();
			hs.setAttribute("str", "session����������");
			hs.invalidate();
			ServletContext sc=this.getServletContext();
			sc.setAttribute("str", "application������������");
		//��Ӧ������
			resp.getWriter().write("this is listener study");
	}
}
