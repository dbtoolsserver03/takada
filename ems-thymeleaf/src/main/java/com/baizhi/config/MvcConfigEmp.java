package com.baizhi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfigEmp  implements WebMvcConfigurer {


    //通过这里面配置: 不需要为每一个访问thymeleaf模板页面单独开发一个controller请求了
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        //viewController 请求路径    viewName: 跳转视图
    	// 跳转到员工管理画面
    	registry.addViewController("/manageEmp").setViewName("redirect:/employee/lists");
        // 增加员工
        registry.addViewController("employee/addEmp").setViewName("emp/addEmp");

        //-------------02-------------
    	registry.addViewController("/manageEmp02").setViewName("redirect:/employee02/lists");
        // 增加员工
        registry.addViewController("employee02/addEmp").setViewName("emp02/addEmp");
        
        //-------------03-------------
    	registry.addViewController("/manageEmp03").setViewName("redirect:/employee03/init");
        // 增加员工
        registry.addViewController("employee03/addEmp").setViewName("emp03/addEmp");
        
        //-------------04-------------
    	registry.addViewController("/manageEmp04").setViewName("redirect:/employee04/lists");
        registry.addViewController("employee04/addEmp").setViewName("redirect:/employee04/addEmpInit");
        
        //-------------05-------------
    	registry.addViewController("/manageEmp05").setViewName("redirect:/employee05/init");
        registry.addViewController("employee05/addEmp").setViewName("emp05/addEmp");

    }
}
