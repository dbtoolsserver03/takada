package com.baizhi.constant;

import java.util.Map;

import com.baizhi.entity.original.MCode;

import lombok.Data;

@Data
public class MasterInfo {

	public static final String UNIQLO_SEX = "uniqlo_sex";
	public static final String UNIQLO_TYPE = "uniqlo_type";
	public static final String UNIQLO_SIZE = "uniqlo_size";
	
	Map<String,Map<String,MCode>> codeMap; 
}
