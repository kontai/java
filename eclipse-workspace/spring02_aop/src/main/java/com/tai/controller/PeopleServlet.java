package com.tai.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tai.service.PeopleService;
import com.tai.service.impl.PeopleServiceImpl;
import com.tai.test.Demo;
import com.tai.test.Demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

@WebServlet("/show")
public class PeopleServlet extends HttpServlet {

	private PeopleService service;
//	private Demo2 demo;

	@Override
	public void init() throws ServletException {
		ApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
		service = context.getBean("peopleService", PeopleServiceImpl.class);
//		demo=context.getBean("demo2",Demo2.class);
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		demo.demo1("kontai");
//		demo.demo2("tai",123);
//		demo.demo3();
	}

}
