package com.baizhi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baizhi.entity.original.Zoo;
import com.baizhi.service.ZooService;

import lombok.extern.slf4j.Slf4j;

@Controller

@Slf4j
public class ZooController {

	@Autowired
	ZooService service;

    /**
     * 公司列表
     *
     * @return
     */
    @RequestMapping("zoo/list")
    public String lists(Model model) {
        log.debug("查询所有公司信息");

//        List<TCompany> objList = new ArrayList<>();
//        TCompany o = new TCompany();
//        o.setId(1).setName("toyota").setPeoplenum(100).setBeginday(new Date());
//        objList.add(o);

        List<Zoo> objList = service.lists();
        // model 是数据 
        // html  是模板
        model.addAttribute("objLst", objList);
        return "zoo/list";
    }
    }