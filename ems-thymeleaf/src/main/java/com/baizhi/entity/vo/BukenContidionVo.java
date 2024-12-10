package com.baizhi.entity.vo;

import java.util.Map;

import com.baizhi.entity.original.MCode;

import lombok.Data;

@Data
public class BukenContidionVo {

	Integer moneyRentMin;
	Integer moneyRentMax;
	
	String location;
	
	String madori;
	
	Map<String,MCode> masterMadoriMap;
	Map<String,MCode> masterPointMap;
	Map<String,MCode> masterDirectionMap;
	Map<String,MCode> masterTypeMap;

}
