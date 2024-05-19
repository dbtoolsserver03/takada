package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.original.TokyoMetro1;

public interface TokyoMetro1Service {

	//列表方法
	List<TokyoMetro1> lists();

	// void delete(Integer id);

	void save(TokyoMetro1 obj);
	
	TokyoMetro1 findRecByPk(int id);
	
	void update(TokyoMetro1 obj);
}
