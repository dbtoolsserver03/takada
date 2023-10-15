package com.baizhi.z.test.config;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.baizhi.z.test.entity.DogBean;

@Configuration
public class BeanConfigs {

    @Bean//(name = "aaa") //用来将改方法返回值交给springboot管理 在工厂中默认标识:类名首字母小写
    @Scope("prototype")  //prototype  singleton
    public Calendar getCalendar(){
        return Calendar.getInstance();
    }
    @Bean
    public DogBean getDogBean(){
        return new DogBean();
    }
}
