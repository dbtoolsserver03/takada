package com.song.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig  implements WebMvcConfigurer {


    
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

     
        registry.addViewController("/").setViewName("redirect:/login");
        registry.addViewController("login").setViewName("login");
        registry.addViewController("register").setViewName("regist");
        registry.addViewController("addEmp").setViewName("addEmp");

    }
}
