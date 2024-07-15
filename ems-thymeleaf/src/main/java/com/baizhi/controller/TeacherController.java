package com.baizhi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baizhi.entity.original.TTeacher;
import com.baizhi.service.TeacherService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class TeacherController {

    @Autowired
    TeacherService service;

  // 通过控制器接收请求后直接返回画面
  @RequestMapping("manageTeacher")
  public String toPage(Model model) {

      log.debug("查询所有员工信息");

      List<TTeacher> objList = service.lists();
      model.addAttribute("objLst", objList);

      return "teacher/teacherlist";
  }


  @RequestMapping("teacher/save")
  public String save(TTeacher obj) {

      log.debug("保存老师信息");

      service.save(obj);
      return "redirect:/manageTeacher";
  }

  @RequestMapping("teacher/detail")
  public String detail(int id,Model model) {

      log.debug("显示老师详细信息");

      TTeacher obj = service.findRecByPk(id);

      model.addAttribute("obj", obj);
      return "teacher/updateTeacher";
  }
  @RequestMapping("teacher/update")
  public String update(TTeacher obj) {

      log.debug("更新老师信息");

      service.update(obj);
      return "redirect:/manageTeacher";
  }



}
