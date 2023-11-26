package com.baizhi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baizhi.entity.original.Carinfo;
import com.baizhi.entity.vo.CarinfoVo;

import lombok.extern.slf4j.Slf4j;


@Controller
@RequestMapping("carInfo")
@Slf4j
public class CarInfoController {

	
	/**
	 * CarInfo列表
	 *
	 * @return
	 */
	@RequestMapping("init")
	public String init(Model model) {
		
		CarinfoVo carinfoVo = new CarinfoVo();
		carinfoVo.setCarinfo(new Carinfo());
		
		model.addAttribute("voxxx", carinfoVo);
		
		return "carInfo/carInfo"; 
	}
	/**
	 * uniqlo列表
	 *
	 * @return
	 */
	@RequestMapping("searchByCondition")
	public String lists(CarinfoVo vo,Model model) {
		
		List<Carinfo> lst = new ArrayList<Carinfo>();
		
		for (int i = 0; i < 3; i++) {
			Carinfo obj = new Carinfo();
			obj.setId(i+1);
			obj.setUsername("username"+i);
			obj.setCartype("CAR TYPE"+i);
			obj.setOdometer(Byte.valueOf((byte)i) );
			obj.setPhoto("photo"+i);
			
			lst.add(obj);
		}
		

		vo.setLst(lst);
		
		model.addAttribute("voxxx", vo);
		
		// 检索数据库
		return "carInfo/carInfo";
	}
}
