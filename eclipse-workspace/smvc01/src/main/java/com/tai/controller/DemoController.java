package com.tai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	@RequestMapping("demo")
	public String demo2() {
		System.out.println("calling demo");
		return "/main.jsp";
	}

}
