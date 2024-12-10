package com.baizhi.entity.vo;

import java.util.List;
import java.util.Map;

import com.baizhi.entity.original.MCode;
import com.baizhi.entity.original.TBuken;
import com.baizhi.entity.original.TBukenIcon;

import lombok.Data;

@Data
public class BukenUpdateVo {
	
	/** 物件レコード */
	TBuken rec;
	
	/** 物件アイコン配列 */
	List<TBukenIcon> icons;
	
	Map<String,MCode> masterMadoriMap;
	Map<String,MCode> masterPointMap;
	Map<String,MCode> masterDirectionMap;
	Map<String,MCode> masterTypeMap;

}
