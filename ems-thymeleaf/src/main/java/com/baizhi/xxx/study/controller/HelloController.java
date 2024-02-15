package com.baizhi.xxx.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("hello")
public class HelloController {

	@GetMapping("hello")
	@ResponseBody
	public String hello() {
		System.out.println("========2========");
		return "hello";
	}

	@GetMapping("world")
	@ResponseBody
	public String world() {
		System.out.println("========world========");
		return "world";
	}
}
