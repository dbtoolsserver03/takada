package com.baizhi.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
        return "demo";
    }
}
