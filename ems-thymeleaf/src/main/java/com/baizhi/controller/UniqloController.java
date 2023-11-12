package com.baizhi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baizhi.entity.original.Uniqlo;
import com.baizhi.entity.vo.UniqloVo;

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
		
		List<Uniqlo> uniqloLst = new ArrayList<Uniqlo>();
		
		for (int i = 0; i < 3; i++) {
			Uniqlo u1 = new Uniqlo();
			u1.setId(i);
			u1.setName("zhang" + i);
			u1.setSize("s"+i);
			u1.setType("t" + i);
			u1.setSex("s"+i);
			uniqloLst.add(u1);
		}
		
		vo.setLst(uniqloLst);
		model.addAttribute("vo",vo);
		// 检索数据库
		return "uniqlo/uniqlolist";
	}
}
