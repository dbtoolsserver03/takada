package com.baizhi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baizhi.constant.MasterInfo;
import com.baizhi.entity.original.Uniqlo;
import com.baizhi.entity.vo.UniqloVo;
import com.baizhi.service.UniqloService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("uniqlo")
@Slf4j
public class UniqloController {

	@Autowired
	private UniqloService uniqloService;

	@Autowired
	private  MasterInfo masterInfo;
	
	@Value("${upload.dir}")
	private String realpath;

	
	@ModelAttribute
	public void addAttributes(Model model) {
	    model.addAttribute("masterMapSex",  masterInfo.getCodeMap().get(MasterInfo.UNIQLO_SEX));
	    model.addAttribute("masterMapSize",  masterInfo.getCodeMap().get(MasterInfo.UNIQLO_SIZE));
	    model.addAttribute("masterMapType",  masterInfo.getCodeMap().get(MasterInfo.UNIQLO_TYPE));
	}
	
	
//	// 表示最终将方法返回值放在request中的key
//	@ModelAttribute("masterMapSex")
//	public Map<String, String> getSexs() {
//		return masterInfo.getCodeMap().get(MasterInfo.UNIQLO_SEX);
//	}
	
	/**
	 * uniqlo列表
	 *
	 * @return
	 */
	@RequestMapping("init")
	public String init(Model model) {
		UniqloVo vo = new UniqloVo();
		// model里的数据，可以显示在画面上。
		model.addAttribute("vo", vo);

		return "uniqlo/uniqlolist";
	}

	/**
	 * uniqlo列表
	 *
	 * @return
	 */
	@RequestMapping("searchList")
	public String searchList(UniqloVo vo,
			Model model) {
		log.debug("查询所有uniqlo信息");
		log.debug("vo:" + vo);

		List<Uniqlo> uniqloLst = uniqloService.lists(vo);

		vo.setUniqloLst(uniqloLst);
		// model里的数据，可以显示在画面上。
		model.addAttribute("vo", vo);

		// 检索数据库
		return "uniqlo/uniqlolist";
	}

	/**
	 * uniqlo列表
	 *
	 * @return
	 */
	@RequestMapping("saveList")
	public String saveList(UniqloVo vo,
			Model model) {
		log.debug("查询所有uniqlo信息");
		log.debug("vo:" + vo);

		uniqloService.savelists(vo);
		

        return "redirect:/uniqlo/searchList";//保存成功跳转到列表页面
	}
	
	
	
}
