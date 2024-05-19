package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.original.Oucompany;

public interface CompanyServiceOu {

	//列表方法
	List<Oucompany> lists();

	//void save(TStudent obj);
//
//	TStudent findRecByPk(int id);
//
//	void update(TStudent obj);
//
//	void delete(Integer id);
	void save(Oucompany obj);
	
}
