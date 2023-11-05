package com.baizhi.controller;

import org.springframework.stereotype.Controller;
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
    public String lists(@RequestParam String name , @RequestParam String size, @RequestParam String priceBegin, @RequestParam String priceEnd) {
        log.debug("查询所有员工信息");
       
        log.debug(name);
        log.debug(size);
        log.debug(priceBegin);
        log.debug(priceEnd);
        return "uniqlo/uniqlolist";
    }
}
