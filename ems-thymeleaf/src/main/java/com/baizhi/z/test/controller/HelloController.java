//package com.baizhi.z.test.controller;
//
//import java.util.Calendar;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Import;
//import org.springframework.context.annotation.ImportResource;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.baizhi.z.test.entity.Cat1Bean;
//import com.baizhi.z.test.entity.Cat2Bean;
//import com.baizhi.z.test.entity.DogBean;
//import com.baizhi.z.test.entity.UserTest;
//
//@Controller
//@RequestMapping("hello")
//
///**
// *   在springboot中提供两种方式配置class 通过springboot 管理自定义java class
// *
// *      a.java config  java配置 自定义java对象管理     [推荐]
// *
// *          @Configuration 注解类似于@Component注解  多个自定义对象管理  [推荐]
// *          @import        注解导入一个配置类         导入指定对象
// *
// *
// *      b.xml方式配置   通过xml配置管理java对象         [了解]
// *          @ImportResource("spring.xml")
// */
//
//@Import(Cat1Bean.class) // 给容器中放指定类型的组件，组件名字默认是全类名
//@ImportResource("test/spring.xml")
//public class HelloController {
//
//	@Autowired
//	private Calendar calendar;
//
//	@Autowired
//	private Calendar calendar1;
//
//	@Autowired
//	private UserTest user;
//
//	@Autowired
//	private Cat1Bean cat1;
//	
//    @Autowired
//    private Cat2Bean cat2;
//    
//	@Autowired
//	private DogBean dog;
//	
//	@GetMapping("hello")
//	@ResponseBody
//	public String hello() {
//		System.out.println("========2========");
//		return "hello" + calendar + "--" + calendar1 
//				+ "--" + user+ "--" + cat1 + dog+ cat2 ;
//	}
//
//	@GetMapping("world")
//	@ResponseBody
//	public String world() {
//		System.out.println("========world========");
//		return "world";
//	}
//}
