package com.baizhi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.baizhi.aop.interceptors.MyInterceptor;

@Configuration
public class MvcConfigInterceptor  implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO 自動生成されたメソッド・スタブ
		WebMvcConfigurer.super.addInterceptors(registry);
		
		registry.addInterceptor(new MyInterceptor())
		.addPathPatterns("/hello/**")//添加拦截的请求路径
		.excludePathPatterns("/hello/world");//添加排除那些请求路径不经过拦截器

		;
		
}

	
}
