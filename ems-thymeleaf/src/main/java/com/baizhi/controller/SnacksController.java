package com.baizhi.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baizhi.entity.original.Snacks;
import com.baizhi.entity.vo.SnacksVo;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("snacks")
@Slf4j
public class SnacksController {

    /**
     * uniqlo列表
     *
     * @return
     */
	@RequestMapping("init")
	public String init(Model model) {
		SnacksVo vo = new SnacksVo();
		vo.setUniqlo(new Snacks());

		model.addAttribute("vo",vo);
		// 检索数据库
		return "snacks/snackslist";
	}
	@RequestMapping("searchByCondition")
	public String lists(SnacksVo vo, Model model) {

List<Snacks> lst = new ArrayList<Snacks>();
		
		for (int i = 0; i < 3; i++) {
			Snacks u1 = new Snacks();
			u1.setId(i);
			u1.setName("zhang" + i);
			u1.setPof(new Date());
			u1.setSalary(Double.valueOf("123"));
		
			lst.add(u1);
		}
		
		vo.setLst(snacksLst);
		model.addAttribute("vo",vo);

        return "snacks/snacks";
    }
}