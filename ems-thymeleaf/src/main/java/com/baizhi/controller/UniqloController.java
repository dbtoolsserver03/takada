package com.baizhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("uniqlo")
@Slf4j
public class UniqloController {

    /**
     * uniqlo列表
     *
     * @return
     */
    @RequestMapping("searchByCondition")
    public String lists(@RequestParam String name ,
    		@RequestParam String type,
    		@RequestParam(defaultValue = "") String size,
    		@RequestParam String priceBegin,
    		@RequestParam String priceEnd,
    		Model model) {
        log.debug("查询所有uniqlo信息");
       
        log.debug(name);
        log.debug(type);
        log.debug(size);
        log.debug(priceBegin);
        log.debug(priceEnd);
        
        // model里的数据，可以显示在画面上。
        model.addAttribute("namexxx", name);
        model.addAttribute("priceBegin", priceBegin);
        
        
        // 检索数据库
     
        
        return "uniqlo/uniqlolist";
    }
}
