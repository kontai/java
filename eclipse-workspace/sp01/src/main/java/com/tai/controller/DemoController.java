package com.tai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

	@RequestMapping("/demo1")
	public String demo1() {
		System.out.println("demo1 invoked..");
		return "main";
	}

	@RequestMapping(value = "/demo2",produces = "text/html;charset=utf-8")
	@ResponseBody
	public String demo2() {
		System.out.println("demo2 invoked..");
		return "中文";
	}
}
