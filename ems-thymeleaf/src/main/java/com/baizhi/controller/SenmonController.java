package com.baizhi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baizhi.entity.original.Senmongakusei;
import com.baizhi.service.SenmonService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("senmon")
@Slf4j
public class SenmonController {

	@Autowired
	SenmonService senmonService;

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

	/**
	 * 専門学生画面検索
	 *
	 * @return
	 */
	@RequestMapping("searchLst")
	public String searchLstxxx(Model model, Senmongakusei obj) {

		model.addAttribute("vo", obj);
		model.addAttribute("objLst", senmonService.searchList(obj));
		return "senmon/senmonSearchLst";
	}

	/**
	 * 専門学生追加画面
	 *
	 * @return
	 */
	@RequestMapping("addInit")
	public String addInit(Model model) {

		return "senmon/senmonAdd";
	}

	/**
	 * 専門学生追加実行
	 *
	 * @return
	 */
	@RequestMapping("save")
	public String save(Model model, Senmongakusei obj) {

		senmonService.addRec(obj);

		return "redirect:/senmon/manageSenmon";
	}

	/**
	 * 専門学生更新画面
	 *
	 * @return
	 */
	@RequestMapping("updateInit")
	public String updateInit(Model model, Senmongakusei obj) {

		Senmongakusei dbRec = senmonService.getOneRec(obj);

		model.addAttribute("obj", dbRec);
		return "senmon/senmonUpdate";
	}

	/**
	 * 専門学生更新実行
	 *
	 * @return
	 */
	@RequestMapping("update")
	public String update(Model model, Senmongakusei obj) {

		senmonService.updateRec(obj);

		return "redirect:/senmon/manageSenmon";
	}

}
