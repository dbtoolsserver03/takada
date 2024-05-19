package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.original.Akibaheadoffice;

public interface AkibaheadofficeService {

	//列表方法
	List<Akibaheadoffice> lists();

	void save(Akibaheadoffice obj);

	Akibaheadoffice findRecByPk(int id);

	void update(Akibaheadoffice obj);
//
//	void delete(Integer id);

}
