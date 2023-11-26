package com.baizhi.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
	@RequestMapping("searchByCondition")
	public String lists(SnacksVo vo, Model model) {
		List<Snacks> snacksLst = service.lists(vo);

		vo.setLst(snacksLst);
		model.addAttribute("vo",vo);
		// 检索数据库
		return "snacks/snacks";
	}
}