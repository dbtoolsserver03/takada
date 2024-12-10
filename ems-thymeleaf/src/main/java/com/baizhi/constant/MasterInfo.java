package com.baizhi.constant;

import java.util.Map;

import com.baizhi.entity.original.MCode;

import lombok.Data;

@Data
public class MasterInfo {

	public static final String FOREIGN_TYPE = "foreign_type";
	public static final String JOB_ROLE = "job_role";
	public static final String SEX = "sex";
	public static final String UNIQLO_SEX = "uniqlo_sex";
	public static final String UNIQLO_TYPE = "uniqlo_type";
	public static final String UNIQLO_SIZE = "uniqlo_size";
	
	public static final String BUKEN_MADORI = "buken_madori";
	public static final String BUKEN_DIRECTION = "buken_direction";
	public static final String BUKEN_POINT = "buken_point";
	public static final String BUKEN_TYPE = "buken_type";
	public static final String DENSYA_TYPE = "DENSYA_TYPE";
	
	
	Map<String,Map<String,MCode>> codeMap; 
}