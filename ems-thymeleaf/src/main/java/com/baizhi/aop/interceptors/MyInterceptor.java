package com.baizhi.aop.interceptors;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.baizhi.entity.User;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {

	@Override //预先处理  最先执行  返回值  true  放行  false 中断请求
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//System.out.println("========1========");
		System.out.println("****  "+request.getRequestURI());

		if (request.getRequestURI().endsWith("/login") 
				|| request.getRequestURI().endsWith("/register")
				|| request.getRequestURI().endsWith("/generateImageCode")) {
			return true;
		}
		
		
		boolean flag = true;
		
    	User user =(User) request.getSession().getAttribute("user");
		if (null == user) {
            response.sendRedirect(request.getContextPath() + "/login");

			//response.sendRedirect("/login");
		} else {
			flag = true;
		}
		return flag;

	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		//System.out.println("========3========");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		//System.out.println("========4========");
	}
}
