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
	
	
	String densyaType;
	String densyaNo;
	String ekiNo;
	
	
	Map<String,MCode> masterMadoriMap;
	Map<String,MCode> masterPointMap;
	Map<String,MCode> masterDirectionMap;
	Map<String,MCode> masterTypeMap;
	Map<String,MCode> masterDensyaTypeMap;
	
	

}
