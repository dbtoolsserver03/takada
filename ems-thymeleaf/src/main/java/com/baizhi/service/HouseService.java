package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.original.Thouse;

public interface HouseService {

	//列表方法
	List<Thouse> lists();

	void save(Thouse obj);

	Thouse findRecByPk(int id);

	void update(Thouse obj);

	void delete(Integer id);

}
