package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.original.TCompany;

public interface CompanyService {

	//列表方法
	List<TCompany> lists();

//
//	TStudent findRecByPk(int id);
//
//	void update(TStudent obj);
//
//	void delete(Integer id);

	void save(TCompany obj);

}
