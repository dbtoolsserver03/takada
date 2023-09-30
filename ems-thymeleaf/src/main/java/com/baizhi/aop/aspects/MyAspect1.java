package com.baizhi.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Aspect
@Configuration
@Order(2)
public class MyAspect1 {



    //环绕通知  当目标方法执行时会先进入环绕通知,然后在环绕通知放行之后进入目标方法,然后执行目标方法,目标方法执行完成之后回到环绕通知
    @Around("within(com.baizhi.service.*ServiceImpl)")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("进入环绕通知业务处理0~~");
        System.out.println(proceedingJoinPoint.getSignature().getName());
        System.out.println(proceedingJoinPoint.getTarget());
        Object proceed = proceedingJoinPoint.proceed();//放行执行业务方法
        System.out.println("业务方法执行之后的业务处理0~~~");
        System.out.println(proceed);
        return proceed;
    }





    /*//前置通知方法  在目标方法执行之前执行操作
    @Before("within(com.baizhi.service.*ServiceImpl)")
    public void before(JoinPoint joinPoint){
        System.out.println("目标方法名称: "+joinPoint.getSignature().getName());
        //System.out.println("目标方法参数: "+joinPoint.getArgs()[0]);
        System.out.println("目标对象: "+joinPoint.getTarget());
        System.out.println("前置通知业务处理~~");
    }

    //后置方法    在目标方法执行之后执行的操作
    @After("within(com.baizhi.service.*ServiceImpl)")
    public void after(JoinPoint joinPoint){
        System.out.println("后置通知的业务处理~~~~");
        System.out.println("目标方法名称: "+joinPoint.getSignature().getName());
        //System.out.println("目标方法参数: "+joinPoint.getArgs()[0]);
        System.out.println("目标对象: "+joinPoint.getTarget());
    }*/
}
