package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.original.TCompany;

public interface CompanyService {

	//列表方法
	List<TCompany> lists();

	//	void delete(Integer id);

	void save(TCompany obj);

	TCompany findRecByPk(int id);

	void update(TCompany obj);

}
