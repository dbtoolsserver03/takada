package com.baizhi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.baizhi.aop.interceptors.MyInterceptor;

@Configuration
public class MvcConfigInterceptor implements WebMvcConfigurer {

	@Value("${upload.dir}")
	private String upload;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO 自動生成されたメソッド・スタブ
		WebMvcConfigurer.super.addInterceptors(registry);

		registry.addInterceptor(new MyInterceptor())
				.addPathPatterns("/**")//添加拦截的请求路径
				.excludePathPatterns("/login", "user/regist","user/generateImageCode")
				.excludePathPatterns("/js/**","/css/**","/files/**","/img/**"
						//, "file:"+upload
						)
				;//添加排除那些请求路径不经过拦截器

	}

//	@Override
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		// TODO 自動生成されたメソッド・スタブ
//		WebMvcConfigurer.super.addResourceHandlers(registry);
//		
//		registry.addResourceHandler("/**")
//		.addResourceLocations("classpath:/static/")
//		.addResourceLocations("classpath:/templates/")
//		.addResourceLocations("file:"+upload)
//		;
//	}

}
