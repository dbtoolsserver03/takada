package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.original.rent;

public interface RentService {

	//列表方法
	List<rent> lists();

	void save(rent obj);

	rent findRecByPk(int id);

	void update(rent obj);

	void delete(Integer id);

}
