package com.baizhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hello")
public class HelloController {

	@GetMapping("hello")
	public String hello() {
		System.out.println("========2========");
		return "upload";
	}

	@GetMapping("world")
	public String world() {
		System.out.println("========world========");
		return "upload";
	}
}
