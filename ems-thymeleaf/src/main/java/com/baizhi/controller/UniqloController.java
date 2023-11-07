package com.baizhi.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("uniqlo")
@Slf4j
public class UniqloController {

	/**
	 * uniqlo列表
	 *
	 * @return
	 */
	@RequestMapping("searchByCondition")
	public String lists(@RequestParam String name,
			@RequestParam String type,
			@RequestParam(defaultValue = "") String sex,
			@RequestParam(defaultValue = "") String size,
			@RequestParam(value = "size") List<String> sizeLst,
			@RequestParam String priceBegin,
			@RequestParam String priceEnd,
			@RequestParam String saleBegin,
			@RequestParam String saleEnd,

			Model model) {
		log.debug("查询所有uniqlo信息");

		log.debug("name:" + name);
		log.debug("type:" + type);
		log.debug("sex:" + sex);
		log.debug("size:" + size);
		log.debug(sizeLst.toString());
		log.debug("priceBegin:" + priceBegin);
		log.debug("priceEnd" + priceEnd);
		log.debug("saleBegin:" + saleBegin);
		log.debug("saleEnd:" + saleEnd);

		// model里的数据，可以显示在画面上。
		model.addAttribute("namexxx", name);
		model.addAttribute("sex", sex);
		model.addAttribute("size", size);
		model.addAttribute("sizeLst", sizeLst);
		model.addAttribute("sex", sex);
		model.addAttribute("type", type);

		model.addAttribute("priceBegin", priceBegin);
		model.addAttribute("priceEnd", priceEnd);

		// date回显
		model.addAttribute("saleBegin", saleBegin);
		model.addAttribute("saleEnd", saleEnd);

		// 检索数据库
		return "uniqlo/uniqlolist";
	}
}
