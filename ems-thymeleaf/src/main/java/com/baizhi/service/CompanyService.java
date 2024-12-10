package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.original.TCompany;

public interface CompanyService {

	// 会社一覧
	List<TCompany> lists();

	void save(TCompany obj);

	TCompany getOneObj(Integer id);

	void update(TCompany obj);

	void delete(Integer id);

	List<TCompany> findRecByNm(String name);


}
