package com.bjsxt.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bjsxt.service.UserSrevice;
import com.bjsxt.serviceImp.UserSeviceImp;
import com.bjsxt.vo.User;
import com.google.gson.Gson;
@WebServlet("/user")

public class UserServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//������������ʽ
		req.setCharacterEncoding("utf-8");
		//������Ӧ�����ʽ
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/xml;charset=utf-8");
		//��ȡ������Ϣ
		String name=req.getParameter("name");
		System.out.println("�û�������ϢΪ��"+name);
		//����������Ϣ
			//��ȡҵ������
			UserSrevice us=new UserSeviceImp();
			//����ҵ��
			User u=us.getUserInfoService(name);
			System.out.println("��ѯ���Ϊ:"+u);
		//��Ӧ������
			resp.getWriter().write(new Gson().toJson(u));
	}
}
