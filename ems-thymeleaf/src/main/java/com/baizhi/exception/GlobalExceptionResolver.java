//package com.baizhi.exception;
//
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.HandlerExceptionResolver;
//import org.springframework.web.servlet.ModelAndView;
//
//@Component
//public class GlobalExceptionResolver  implements HandlerExceptionResolver {
//
//
//    //resolveExcpetion: 当控制器中任意一个方法出现异常时,如果该控制器的方法没有自己异常处理(try...catch),则会进入当前方法
//    //注意:在异常处理这个方法中 完成自定义异常处理
//    //参数1: request 当前请求对象
//    //参数2: response 当前请求对应响应对象
//    //参数3: 当前出现错误的方法对象
//    //参数4: 出现异常的异常对象
//    //返回值: modelAndview 模型和视图
//	@Override
//	public ModelAndView resolveException(jakarta.servlet.http.HttpServletRequest request,
//			jakarta.servlet.http.HttpServletResponse response, Object handler, Exception ex) {
//        System.out.println("这是全局异常处理....");
//        System.out.println("当前异常为: "+ex);
//        ModelAndView modelAndView = new ModelAndView();
//
//        //针对不同异常类型跳转不同页面
////        if(ex instanceof UserNameNotFoundException){
////            modelAndView.setViewName("error");
////            return modelAndView;
////        }
//        modelAndView.setViewName("err/error");
//        return modelAndView;
//	}
//}
