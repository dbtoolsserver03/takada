package com.baizhi.entity.vo;

import java.util.List;

import com.baizhi.entity.original.Carinfo;

import lombok.Data;

// 有了个这注解，就有了GET,SET方法


// Vo View  Object
@Data
public class CarinfoVo {

	public CarinfoVo() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	
	// 检索条件
	private Carinfo carinfo;	
	private Integer odometerBegin;
	private Integer odometerEnd;	
	
	// 检索出来的数据
	private List<Carinfo> lst;
	

}
