package com.bjsxt.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/xml")
public class XMLServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//������������ʽ
		//������Ӧ�����ʽ
			resp.setCharacterEncoding("utf-8");
			resp.setContentType("text/xml;charset=utf-8");
		//��ȡ������Ϣ
		//����������Ϣ
		//��Ӧ������
			resp.getWriter().write("<user><uid>1</uid><name>����</name><price>11.11</price></user>");
	}
}
