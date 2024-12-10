package com.baizhi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfigCompany  implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

    	registry.addViewController("/manageCompany").setViewName("redirect:/company/lists");
    	registry.addViewController("/company/add").setViewName("company/addCompany");
        
    
    }
}
