package com.baizhi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baizhi.entity.original.Uniqlo;
import com.baizhi.entity.vo.UniqloVo;
import com.baizhi.service.UniqloService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("uniqlo")
@Slf4j
public class UniqloController {

	@Autowired
	UniqloService service;
	/**
	 * uniqlo列表
	 *
	 * @return
	 */
	@RequestMapping("init")
	public String init(Model model) {
		UniqloVo vo = new UniqloVo();
		vo.setUniqlo(new Uniqlo());
		
		model.addAttribute("vo",vo);
		// 检索数据库
		return "uniqlo/uniqlolist";
	}

	/**
	 * uniqlo列表
	 *
	 * @return
	 */
	@RequestMapping("searchByCondition")
	public String lists(UniqloVo vo, Model model) {
		
		List<Uniqlo> uniqloLst = service.lists(vo);
		
		vo.setLst(uniqloLst);
		model.addAttribute("vo",vo);
		// 检索数据库
		return "uniqlo/uniqlolist";
	}
}
