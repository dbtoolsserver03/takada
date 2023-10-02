//package com.baizhi.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
//
//import com.baizhi.aop.interceptors.MyInterceptor;
//
//@Configuration
//public class InterceptorConfig extends WebMvcConfigurationSupport {
//
//	@Override
//	public void addInterceptors(InterceptorRegistry registry) {
//
//		registry.addInterceptor(new MyInterceptor())//添加拦截器
//				.addPathPatterns("/hello/**")//添加拦截的请求路径
//				.excludePathPatterns("/hello/world");//添加排除那些请求路径不经过拦截器
//	}
//}
