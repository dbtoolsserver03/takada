package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.original.TStudent;

public interface StudentService {

    //员工列表方法
    List<TStudent> lists();

	void save(TStudent obj);

	TStudent findRecByPk(int id);

	void update(TStudent obj);

	void delete(Integer id);

}
