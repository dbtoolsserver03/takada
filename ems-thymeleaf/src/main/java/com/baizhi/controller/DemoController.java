package com.baizhi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("demo")
public class DemoController {

    private static final Logger log = LoggerFactory.getLogger(DemoController.class);

    @RequestMapping("demo")
    public String demo(Model model){
        log.debug("demo ok");
        model.addAttribute("msg","hello thymeleaf");
        return "demo";
    }
}
