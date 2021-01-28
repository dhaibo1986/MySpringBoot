package com.dhb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHelloController {
	@RequestMapping("/resthello")
	public String hello() {
		return "hello word!";
	}
}
