package com.baizhi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baizhi.entity.original.rent;
import com.baizhi.service.RentService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("rent")
@Slf4j
public class RentController {
	
	@Autowired
	RentService service;
	
    /**
     * 学生列表
     *
     * @return
     */
    @RequestMapping("lists")
    public String lists(Model model) {
        log.debug("查询所有员工信息");
        List<Trent> objList = service.lists();
        model.addAttribute("objLst", objList);
        return "rent/rentlist";
    }
    
    /**
     * 学生新规保存
     *
     * @return
     */
    @RequestMapping("save")
    public String save(Trent obj) {
    	
    	service.save(obj);
       
        return "redirect:lists";
    }
    //
    //
public String save(int houseid,float rentvalue) {
	
//    	rent obj;
    	Trent obj=new Trent();
    	
    	obj.setHouseid(houseid);
    	obj.setRentvalue(rentvalue);
    	
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
    	
    	rent s = service.findRecByPk(id);
       
    	model.addAttribute("obj", s);
    	
        return "rent/updaterent";
    }
    
    /**
     * 学生更新
     *
     * @return
     */
    @RequestMapping("update")
    public String update(rent obj) {
    	
    	service.update(obj);
       
        return "redirect:lists";
    }
      

    /**
     * 学生删除
     *
     * @return
     */
    @RequestMapping("delete")
    public String delete(Integer houseid) {
    	
    	service.delete(houseid);
       
        return "redirect:lists";
    }
    
    }
