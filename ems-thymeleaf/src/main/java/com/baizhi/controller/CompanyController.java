package com.baizhi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baizhi.entity.original.TCompany;
import com.baizhi.service.CompanyService;

import lombok.extern.slf4j.Slf4j;

@Controller

@Slf4j
public class CompanyController {

	@Autowired
	CompanyService service;
	
    /**
     * 公司列表
     *
     * @return
     */
    @RequestMapping("company/lists")
    public String lists(Model model) {
        log.debug("查询所有公司信息");
        
//        List<TCompany> objList = new ArrayList<>();
//        TCompany o = new TCompany();
//        o.setId(1).setName("toyota").setPeoplenum(100).setBeginday(new Date());
//        objList.add(o);
        
        List<TCompany> objList = service.lists();
        // model 是数据 
        // html  是模板
        model.addAttribute("objLst", objList);
        return "company/companylist";
    }
   
    
    
    /**
     * 公司保存
     *
     * @return
     */
    @RequestMapping("company/save")
    public String save(TCompany obj) {
        log.debug("保存公司信息");
        
        service.save(obj);
        
        return "redirect:/company/lists";
    }
    
    
    /**
     * 公司更新画面初期化
     *
     * @return
     */
    @RequestMapping("company/detail")
    public String updateInit(TCompany obj,Model model) {
        log.debug("公司更新画面初期化");
        
        
        System.out.println(obj.getId());
        TCompany rec = service.getOne(obj);
        
        model.addAttribute("obj", rec);
        return "company/updateCompany";
    }
    
    
    
    /**
     * 公司更新画面更新実行
     *
     * @return
     */
    @RequestMapping("company/updateRec")
    public String updateInit(TCompany obj) {
        log.debug("公司更新画面更新実行");
        
        
        service.updateRec(obj);
        
        return "redirect:/company/lists";
    }
    
}
