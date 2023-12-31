package com.baizhi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfigUniqlo  implements WebMvcConfigurer {


    //通过这里面配置: 不需要为每一个访问thymeleaf模板页面单独开发一个controller请求了
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        //viewController 请求路径    viewName: 跳转视图
    	
    	// 跳转到优衣库管理画面
    	//registry.addViewController("/manageUniqlo").setViewName("/uniqlo/uniqloList");
    	registry.addViewController("/manageUniqlo").setViewName("redirect:/uniqlo/init");
    	
    	registry.addViewController("/manageUniqloAdd").setViewName("redirect:/uniqlo/addInit");
    	
    	//registry.addViewController("/manageUniqloUpdate").setViewName("redirect:/uniqlo/updateInit");
    	
    	
    	
    }
}
