package com.baizhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
@SpringBootApplication
@MapperScan("com.baizhi.dao")
public class EmsThymeleafApplication extends SpringBootServletInitializer{
    public static void main(String[] args) {
    	ConfigurableApplicationContext  ctx = SpringApplication.run(EmsThymeleafApplication.class,args);
    
    	System.out.println("++++++++++ begin");
    	for(String name : ctx.getBeanDefinitionNames()) {
    		System.out.println(name);
    	}
      	System.out.println("++++++++++ end");
    	
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(EmsThymeleafApplication.class);
    }
}