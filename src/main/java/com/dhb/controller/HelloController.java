package com.dhb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	@ResponseBody
	public String hello(HttpSession session) {
		session.setAttribute("aa","aa");
		return "hello";
	}

}
