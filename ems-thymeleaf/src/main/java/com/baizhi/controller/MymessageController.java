package com.baizhi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baizhi.entity.original.TMymessage;
import com.baizhi.service.MymessageService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MymessageController {

	@Autowired
    MymessageService service;
  // 通过控制器接收请求后直接返回画面
  @RequestMapping("manageMymessage")
  public String toPage(Model model) {

//      log.debug("查询所有员工信息");
//      List<TMymessage> objList = new ArrayList<>();
//
//      TMymessage obj1 = new TMymessage();
//      obj1.setId(1).setName("zhang3").setJikan(new Date()).setAge(15);
//
//      TMymessage obj2 = new TMymessage();
//      obj2.setId(2).setName("li4").setJikan(new Date()).setAge(20);
//
//      objList.add(obj1);
//      objList.add(obj2);
//
//      model.addAttribute("objLst", objList);
      
      List<TMymessage> objList = service.lists();
      model.addAttribute("objLst", objList);

      return "mymessage/mymessagelist";
  }

}
