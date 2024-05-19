package com.baizhi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baizhi.dao.original.TokyoMetro1Mapper;
import com.baizhi.entity.original.TokyoMetro1;

@Service
@Transactional
public class TokyoMetro1ServiceImpl implements TokyoMetro1Service {

	@Autowired
	TokyoMetro1Mapper mapper;

	@Override
	public List<TokyoMetro1> lists() {
		return mapper.selectByExample(null);
	}
//
	@Override
	public void save(TokyoMetro1 obj) {
		mapper.insertSelective(obj);

	}
	@Override
	public void update(TokyoMetro1 obj) {
			mapper.updateByPrimaryKeySelective(obj);
	}
//
//	@Override
//	public void delete(Integer id) {
//		mapper.deleteByPrimaryKey(id);
//	}

	@Override
	public TokyoMetro1 findRecByPk(int id) {
		// TODO 自動生成されたメソッド・スタブ
		return mapper.selectByPrimaryKey(id);
	}

}

