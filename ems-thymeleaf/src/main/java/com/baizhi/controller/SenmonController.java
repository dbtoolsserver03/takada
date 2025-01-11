package com.baizhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baizhi.entity.original.Senmongakusei;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("senmon")
@Slf4j
public class SenmonController {

	/**
	 * 専門学生画面初期化
	 *
	 * @return
	 */
	@RequestMapping("manageSenmon")
	public String init(Model model) {

		model.addAttribute("vo", new Senmongakusei());
		return "senmon/senmonSearchLst";
	}
	
}
