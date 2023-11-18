package com.baizhi.entity.vo;

import java.util.Date;
import java.util.List;

import com.baizhi.entity.original.Snacks;

import lombok.Data;


// 有了个这注解，就有了GET,SET方法
@Data

// Vo View  Object
public class SnacksVo {

	public SnacksVo() {
	}


	// 检索条件
	private Snacks snacks;
	private Double priceBegin;
	private Double priceEnd;
	private Date saleBegin;
	private Date saleEnd;

	// 检索出来的数据
	private List<Snacks> lst;


}