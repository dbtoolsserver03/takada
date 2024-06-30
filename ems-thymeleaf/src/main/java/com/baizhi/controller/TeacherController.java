package com.baizhi.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baizhi.entity.original.TTeacher;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class TeacherController {

  // 通过控制器接收请求后直接返回画面
  @RequestMapping("manageTeacher")
  public String toPage(Model model) {

      log.debug("查询所有员工信息");
      List<TTeacher> objList = new ArrayList<>();

      TTeacher obj1 = new TTeacher();
      obj1.setId(1).setName("zhang3").setSalary(10000).setBirthday(new Date()).setSex("01");

      TTeacher obj2 = new TTeacher();
      obj2.setId(2).setName("li4").setSalary(20000).setBirthday(new Date()).setSex("00");

      objList.add(obj1);
      objList.add(obj2);

      model.addAttribute("objLst", objList);

      return "teacher/teacherlist";
  }

}
