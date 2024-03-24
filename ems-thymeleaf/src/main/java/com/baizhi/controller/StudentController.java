package com.baizhi.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baizhi.entity.original.TStudent;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("student")
@Slf4j
public class StudentController {

	
    /**
     * 学生列表
     *
     * @return
     */
    @RequestMapping("lists")
    public String lists(Model model) {
        log.debug("查询所有员工信息");
        List<TStudent> objList = new ArrayList<>();
        
        TStudent s = new TStudent();
        s.setStudentId(1).setEmail("a@1.com").setStudentName("zhang3").setBirthdate(new Date());
        
        
        objList.add(s);
        model.addAttribute("objLst", objList);
        return "student/studentlist";
    }
}
