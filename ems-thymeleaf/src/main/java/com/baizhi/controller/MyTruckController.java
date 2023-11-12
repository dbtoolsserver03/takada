package com.baizhi.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baizhi.entity.original.Mytruck;
import com.baizhi.entity.vo.MytruckVo;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("mytruck")
@Slf4j
public class MyTruckController {

	
	/**
	 * uniqlo列表
	 *
	 * @return
	 */
	@RequestMapping("init")
	public String init(Model model) {
		
		MytruckVo mytruckVo = new MytruckVo();
		mytruckVo.setMyTruck(new Mytruck());
		
		model.addAttribute("voxxx", mytruckVo);
		
		return "truck/trucklist"; 
	}
	/**
	 * uniqlo列表
	 *
	 * @return
	 */
	@RequestMapping("searchByCondition")
	public String lists(MytruckVo vo,Model model) {
		
		List<Mytruck> lst = new ArrayList<Mytruck>();
		
		for (int i = 0; i < 3; i++) {
			Mytruck obj = new Mytruck();
			obj.setId(i);
			obj.setCarName("car name" + i);
			obj.setPrice(Double.valueOf(10000 + i) );
			obj.setProductDay(new Date());
			lst.add(obj);
		}

		vo.setLst(lst);
		
		model.addAttribute("voxxx", vo);
		
		// 检索数据库
		return "truck/trucklist";
	}
}
