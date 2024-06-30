package com.baizhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class TeacherController {

  // 通过控制器接收请求后直接返回画面
  @RequestMapping("manageTeacher")
  public String toPage() {

      return "teacher/testTeacher";
  }

}
