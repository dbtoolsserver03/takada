package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.original.TCompany;

public interface CompanyService {

	//列表方法
	List<TCompany> lists();

	// 保存
	void save(TCompany obj);

	TCompany getOne(TCompany obj);

	void updateRec(TCompany obj);


}
