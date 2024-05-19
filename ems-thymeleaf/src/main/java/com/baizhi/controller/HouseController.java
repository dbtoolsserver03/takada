package com.baizhi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baizhi.entity.original.Thouse;
import com.baizhi.service.HouseService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("house")
@Slf4j
public class HouseController {
	
	@Autowired
	HouseService service;
	
    /**
     * 学生列表
     *
     * @return
     */
    @RequestMapping("lists")
    public String lists(Model model) {
        log.debug("查询所有员工信息");
        List<Thouse> objList = service.lists();
        model.addAttribute("objLst", objList);
        return "house/houselist";
    }
    
    /**
     * 学生新规保存
     *
     * @return
     */
    @RequestMapping("save")
    public String save(Thouse obj) {
    	
    	service.save(obj);
       
        return "redirect:lists";
    }
    
    /**
     * 学生更新初期化
     *
     * @return
     */
    @RequestMapping("detail")
    public String detail(Model model, int id) {
    	
    	Thouse s = service.findRecByPk(id);
       
    	model.addAttribute("obj", s);
    	
        return "house/updateHouset";
    }
    
    /**
     * 学生更新
     *
     * @return
     */
    @RequestMapping("update")
    public String update(Thouse obj) {
    	
    	service.update(obj);
       
        return "redirect:lists";
    }
      

    /**
     * 学生删除
     *
     * @return
     */
    @RequestMapping("delete")
    public String delete(Integer studentId) {
    	
    	service.delete(studentId);
       
        return "redirect:lists";
    }
    
    }
