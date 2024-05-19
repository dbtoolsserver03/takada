package com.baizhi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baizhi.entity.original.TokyoMetro1;
import com.baizhi.service.TokyoMetro1Service;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("metro")
@Slf4j
public class TokyoMetro1Controller {
	
	@Autowired
	TokyoMetro1Service service;
	
    /**
     * 公司列表
     *
     * @return
     */
    @RequestMapping("lists")
    public String lists(Model model) {
        log.debug("查询所有公司信息");
        
        List<TokyoMetro1> objList = service.lists();
        model.addAttribute("objLst", objList);
        return "Metro/TokyoMetro1list";
    }
    
    
    
    
    /**
     * 地下铁新规保存
     *
     * @return
    */
    @RequestMapping("save")
    public String lists(TokyoMetro1 obj) {
    	
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
    	
    	TokyoMetro1 tokyoMetro1  = service.findRecByPk(id);
       
    	model.addAttribute("obj", tokyoMetro1);
    	
        return "metro/updateMetro";
    }
    
    /**
     * 学生更新
     *
     * @return
     */
    @RequestMapping("update")
    public String update(TokyoMetro1 obj) {
  	
    	service.update(obj);
       
        return "redirect:lists";
    }
//      
//
//    /**
//     * 学生删除
//     *
//     * @return
//     */
//    @RequestMapping("delete")
//    public String delete(Integer studentId) {
//    	
//    	service.delete(studentId);
//       
//        return "redirect:lists";
//    }
    
}



