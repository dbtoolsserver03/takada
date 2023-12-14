package com.baizhi.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.baizhi.entity.original.Snacks;
import com.baizhi.entity.vo.SnacksVo;
import com.baizhi.service.SnacksService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("snacks")
@Slf4j
public class SnacksController {
	@Autowired
	SnacksService service;
    /**
     * uniqlo列表
     *
     * @return
     */
	@RequestMapping("init")
	public String init(Model model) {
		SnacksVo vo = new SnacksVo();
		vo.setSnacks(new Snacks());

		model.addAttribute("vo",vo);
		// 检索数据库
		return "snacks/snacks";
	}
	/**
	 * uniqlo列表
	 *
	 * @return
	 */
	@RequestMapping("addInit")
	public String addInit(Model model) {
		SnacksVo vo = new SnacksVo();
		vo.setSnacks(new Snacks());
		
		model.addAttribute("vo",vo);
		// 检索数据库
		return "snacks/snacksadd";
	}
	@RequestMapping("updateInit")
	public String updateInit(@RequestParam int id, Model model) {
		SnacksVo vo = new SnacksVo();
		
		System.out.println(id);
		
		Snacks dbObj =  service.getOneRec(id);
		
		
		vo.setSnacks(dbObj);
		
		
		
		model.addAttribute("vo",vo);
		// 检索数据库
		return "snacks/snacksUpdate";
	}

	@RequestMapping("searchByCondition")
	public String lists(SnacksVo vo, Model model) {
		List<Snacks> snacksLst = service.lists(vo);

		vo.setLst(snacksLst);
		model.addAttribute("vo",vo);
		// 检索数据库
		return "snacks/snacks";
	}
	@RequestMapping("addSnacks")
	public String addSnacksxxxxx(SnacksVo vo, Model model) {
		
		service.addRec(vo);
	
		return "redirect:/snacks/init";
	}
	

	
	/**
	 * uniqlo列表
	 *
	 * @return
	 */
	@RequestMapping("updateSnacks")
	public String updateSnacks(SnacksVo vo, Model model) {
		
		service.updateRec(vo);
	
		return "redirect:/snacks/init";
	}

	
	/**
	 * uniqlo列表
	 *
	 * @return
	 */
	@RequestMapping("deleteOne")
	public String deleteOne(@RequestParam int id, Model model) {
		
		service.deleteOneRec(id);
	
		return "redirect:/snacks/init";
	}
	

	
	/**
	 * uniqlo列表
	 *
	 * @return
	 */
	@RequestMapping("deleteAll")
	public String deleteAll(SnacksVo vo, Model model) {
		
		for(Snacks obj :  vo.getLst()) {
			service.deleteOneRec(obj.getId());
		}
		
	
		return "redirect:/snacks/init";
	}
	
	
	
}
