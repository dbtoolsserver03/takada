package com.baizhi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig  implements WebMvcConfigurer {

    //通过这里面配置: 不需要为每一个访问thymeleaf模板页面单独开发一个controller请求了
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        //viewController 请求路径    viewName: 跳转视图
    	// 首页跳转
    	registry.addViewController("/").setViewName("redirect:/login");
    	
    	// 菜单画面
    	registry.addViewController("/menu").setViewName("menu");

    	// 画面登陆
        registry.addViewController("login").setViewName("login");
        
        // 新用户注册
        registry.addViewController("register").setViewName("user/regist");

    }
}
