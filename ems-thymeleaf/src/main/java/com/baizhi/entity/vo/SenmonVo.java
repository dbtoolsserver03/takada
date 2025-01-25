package com.baizhi.entity.vo;

import java.util.Map;

import com.baizhi.entity.original.MCode;

import lombok.Data;

@Data
public class SenmonVo {

	private Map<String, MCode> masterSexMap;
	private Map<String, String> masterGakkaMap;

}
