package com.baizhi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baizhi.entity.original.Akibaheadoffice;
import com.baizhi.service.AkibaheadofficeService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("Member")
@Slf4j
public class AkibaheadofficeController {
	
	@Autowired
	AkibaheadofficeService service;
	
    /**
     * 公司列表
     *
     * @return
     */
    @RequestMapping("lists")
    public String lists(Model model) {
        log.debug("查询所有公司信息");
        
        List<Akibaheadoffice> objList = service.lists();
        model.addAttribute("objLst", objList);
        return "Member/Akibaheadofficelist";
    }
    /**
     * 学生新规保存
     *     *
     * @return
     */
    @RequestMapping("save")
    public String lists(Akibaheadoffice obj) {
    	
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
    	
    	Akibaheadoffice s = service.findRecByPk(id);
       
    	model.addAttribute("obj", s);
    	
        return "Akibaheadoffice/updateAkibaheadoffice";
    }
    
    /**
     * 学生更新
     *
     * @return
     */
    @RequestMapping("update")
    public String update(Akibaheadoffice obj) {
    	
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



