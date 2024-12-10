package com.baizhi.entity.vo;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.baizhi.entity.original.MCode;
import com.baizhi.entity.original.TBuken;

import lombok.Data;

@Data
public class BukenAddVo {
	
	/** 物件レコード */
	TBuken rec;
	
	/** 物件アイコン配列 */
	MultipartFile urls;
	
	Map<String,MCode> masterMadoriMap;
	Map<String,MCode> masterPointMap;
	Map<String,MCode> masterDirectionMap;
	Map<String,MCode> masterTypeMap;
	Map<String,MCode> masterDensyaTypeMap;

}
