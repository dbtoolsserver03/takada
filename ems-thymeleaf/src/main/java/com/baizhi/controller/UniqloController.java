package com.baizhi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	@RequestMapping("addInit")
	public String addInit(Model model) {
		UniqloVo vo = new UniqloVo();
		vo.setUniqlo(new Uniqlo());
		
		model.addAttribute("vo",vo);
		// 检索数据库
		return "uniqlo/uniqloAdd";
	}


	/**
	 * uniqlo列表
	 *
	 * @return
	 */
	@RequestMapping("updateInit")
	public String updateInit(@RequestParam int id, Model model) {
		UniqloVo vo = new UniqloVo();
		
		System.out.println(id);
		
		Uniqlo dbObj =  service.getOneRec(id);
		
		
		vo.setUniqlo(dbObj);
		
		
		
		model.addAttribute("vo",vo);
		// 检索数据库
		return "uniqlo/uniqloUpdate";
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
	
	
	/**
	 * uniqlo列表
	 *
	 * @return
	 */
	@RequestMapping("addUniqlo")
	public String addUniqloxxxxx(UniqloVo vo, Model model) {
		
		service.addRec(vo);
	
		return "redirect:/uniqlo/init";
	}
	

	
	/**
	 * uniqlo列表
	 *
	 * @return
	 */
	@RequestMapping("updateUniqlo")
	public String updateUniqlo(UniqloVo vo, Model model) {
		
		service.updateRec(vo);
	
		return "redirect:/uniqlo/init";
	}

	
	/**
	 * uniqlo列表
	 *
	 * @return
	 */
	@RequestMapping("deleteOne")
	public String deleteOne(@RequestParam int id, Model model) {
		
		service.deleteOneRec(id);
	
		return "redirect:/uniqlo/init";
	}
	

	
	/**
	 * uniqlo列表
	 *
	 * @return
	 */
	@RequestMapping("deleteAll")
	public String deleteAll(UniqloVo vo, Model model) {
		
		for(Uniqlo obj :  vo.getLst()) {
			service.deleteOneRec(obj.getId());
		}
		
	
		return "redirect:/uniqlo/init";
	}
	
	
	
}
