package com.baizhi.z.test.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baizhi.z.test.entity.UserTest;

@Controller
@RequestMapping("demo")
public class DemoController {

    private static final Logger log = LoggerFactory.getLogger(DemoController.class);

    @Value("${a.b}")
    private int num;

    @Value("${bir}")
    private Date bir;

    @Value("${strs}")
    private String[] strs;

    @Value("${qqs}")
    private List<String> qqs;

    @Value("#{${maps}}")
    private Map<String,String> maps;
    
    @RequestMapping("demo")
    public String demo(Model model){
        log.debug("demo ok");
        model.addAttribute("msg","hello thymeleaf");
        model.addAttribute("num",  num);
        model.addAttribute("bir", bir);
        model.addAttribute("strs", strs);
        model.addAttribute("qqs", qqs);
        model.addAttribute("maps", maps);
        
//        # 总结
//        -  1.使用 th:text="${属性名}"  获取对应数据,获取数据时会将对应标签中数据清空,因此最好是空标签
//        -  2.使用 th:utext="${属性名}" 获取对应的数据,可以将数据中html先解析在渲染到页面
//        -  3.使用 th:value="${属性名}" 获取数据直接作为表单元素value属性
        model.addAttribute("name","张三");
        model.addAttribute("nameA","<a href=''>张三</a>");
        model.addAttribute("username","小陈");
        
        
        model.addAttribute("user",new UserTest("21","xiaochen",10000,new Date()));
        
        List<UserTest> lst = new ArrayList<UserTest>();
        lst.add(new UserTest("11","xiaochen",10000,new Date()));
        lst.add(new UserTest("12","xiaowang",5000,new Date()));
        lst.add(new UserTest("13","xiaosan",30000,new Date()));
        model.addAttribute("users",lst);
        return "test/demo";
    }
}
