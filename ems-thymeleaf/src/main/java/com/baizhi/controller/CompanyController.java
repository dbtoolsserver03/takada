package com.baizhi.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baizhi.entity.original.TCompany;
import com.baizhi.service.CompanyService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("company")
@Slf4j
public class CompanyController {

	@Autowired
	CompanyService service;

	/**
	 * 会社一覧
	 *
	 * @return
	 */
	@RequestMapping("lists")
	public String lists(Model model) {
		log.debug("会社の明細一覧を表示する");

		List<TCompany> objList = service.lists();
		model.addAttribute("objLst", objList);
		return "company/companylist";
	}

	/**
	 * 会社新規追加
	 *
	 * @return
	 */
	@RequestMapping("save")
	public String lists(TCompany obj) {
		log.debug("会社を新規作成する");
		service.save(obj);
		return "redirect:lists";
	}

	/**
	 * 会社更新画面初期化
	 *
	 * @return
	 */
	@RequestMapping("updateInit")
	public String updateInit(Model model, TCompany obj) {
		log.debug("会社更新画面初期化する");

		TCompany dbObj = service.getOneObj(obj.getId());

		model.addAttribute("obj", dbObj);
		return "company/updateCompany";
	}

	/**
	 * 会社更新画面の更新処理
	 *
	 * @return
	 */
	@RequestMapping("update")
	public String updateInit(TCompany obj) {
		log.debug("会社更新画面の更新処理を実行する");

		service.update(obj);

		return "redirect:lists";
	}

	/**
	 * 会社削除処理
	 *
	 * @return
	 */
	@RequestMapping("delete")
	public String delete(TCompany obj) {
		log.debug("会社削除処理を実行する");

		service.delete(obj.getId());

		return "redirect:lists";
	}

	/**
	 * AJAXを利用し、既存データをチェックする。
	 *
	 * @return
	 */
	@RequestMapping("ajaxCheck")
	public @ResponseBody Map<String, Object> handleAjaxRequest(@RequestBody Map<String, Object> requestParams) {

		Map<String, Object> responseData = new HashMap<>();

		List<TCompany> lst = service.findRecByNm((String) requestParams.get("name"));

		if (lst.size() > 0) {

			responseData.put("message", "使えません");

		} else {
			responseData.put("message", "使えます");

		}

		// リスポンスを戻ります。
		return responseData;
	}

}
