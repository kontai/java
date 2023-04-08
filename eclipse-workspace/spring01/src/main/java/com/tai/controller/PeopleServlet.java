package com.tai.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tai.service.PeopleService;
import com.tai.service.impl.PeopleServiceImpl;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;



@WebServlet("/show")
public class PeopleServlet extends HttpServlet {

	private PeopleService service;

	@Override
	public void init() throws ServletException {
		ApplicationContext context =
				WebApplicationContextUtils.getRequiredWebApplicationContext( getServletContext());
		service = context.getBean("peopleService", PeopleServiceImpl.class);
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(service.show());
	}

}
