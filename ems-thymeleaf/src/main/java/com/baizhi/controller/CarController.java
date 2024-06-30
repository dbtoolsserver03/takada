package com.baizhi.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baizhi.entity.original.TCar;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class CarController {

  // 通过控制器接收请求后直接返回画面
  @RequestMapping("manageCar")
  public String toPage(Model model) {


      log.debug("查询所有员工信息");
      List<TCar> objList = new ArrayList<>();

      TCar obj1 = new TCar();
      obj1.setId(1).setName("zhang3").setPrice(10000).setProductday(new Date());

      TCar obj2 = new TCar();
      obj2.setId(2).setName("li4").setPrice(20000).setProductday(new Date());

      objList.add(obj1);
      objList.add(obj2);

      model.addAttribute("objLst", objList);
      return "car/Carlist";
     
  }

}
