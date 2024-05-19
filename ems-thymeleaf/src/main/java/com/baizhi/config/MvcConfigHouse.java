package com.baizhi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfigHouse  implements WebMvcConfigurer {

    //通过这里面配置: 不需要为每一个访问thymeleaf模板页面单独开发一个controller请求了
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

    	//registry.addViewController("/managehouse").setViewName("/house/house_fee.html");
    	registry.addViewController("/managehouse").setViewName("redirect:/house/lists");
       //viewController 请求路径    viewName: 跳转视图
		registry.addViewController("/house/updateHouse").setViewName("redirect:/house/updateHouse");
		    	
		// 增加员工
		registry.addViewController("/house/addHouse").setViewName("house/addHouse");
    }
}
