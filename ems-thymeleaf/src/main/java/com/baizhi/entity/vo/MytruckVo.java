package com.baizhi.entity.vo;

import java.util.Date;
import java.util.List;

import com.baizhi.entity.original.Mytruck;

import lombok.Data;


// 有了个这注解，就有了GET,SET方法
@Data

// Vo View  Object
public class MytruckVo {

	public MytruckVo() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	
	// 检索条件
	private Mytruck myTruck;
	private Double priceBegin;
	private Double priceEnd;
	private Date productDayBegin;
	private Date productDayEnd;
	
	// 检索出来的数据
	private List<Mytruck> lst;
	

}
