package com.baizhi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baizhi.entity.original.TStudent;
import com.baizhi.service.StudentService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("student")
@Slf4j
public class StudentController {

	
	@Autowired
	StudentService service;
	
    /**
     * 学生列表
     *
     * @return
     */
    @RequestMapping("lists")
    public String lists(Model model) {
        log.debug("查询所有员工信息");
        List<TStudent> objList = service.lists();
        model.addAttribute("objLst", objList);
        return "student/studentlist";
    }
    
    /**
     * 学生新规
     *
     * @return
     */
    @RequestMapping("save")
    public String lists(TStudent obj) {
    	
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
    	
    	TStudent s = service.findRecByPk(id);
       
    	model.addAttribute("obj", s);
    	
        return "student/updateStudent";
    }
    
    /**
     * 学生新规
     *
     * @return
     */
    @RequestMapping("update")
    public String update(TStudent obj) {
    	
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
