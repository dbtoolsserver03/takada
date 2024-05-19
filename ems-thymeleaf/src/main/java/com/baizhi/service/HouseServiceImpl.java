package com.baizhi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baizhi.dao.original.ThouseMapper;
import com.baizhi.entity.original.Thouse;

@Service
@Transactional
public class HouseServiceImpl implements HouseService {

	@Autowired
	ThouseMapper mapper;

	@Override
	public List<Thouse> lists() {
		return mapper.selectByExample(null);
	}
//
//	@Override
//	public void save(TStudent obj) {
//		mapper.insertSelective(obj);
//
//	}
//
//	@Override
//	public TStudent findRecByPk(int id) {
//		return mapper.selectByPrimaryKey(id);
//
//	}
//
//	@Override
//	public void update(TStudent obj) {
//		mapper.updateByPrimaryKeySelective(obj);
//	}
//
//	@Override
//	public void delete(Integer id) {
//		mapper.deleteByPrimaryKey(id);
//	}

	@Override
	public void save(Thouse obj) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public Thouse findRecByPk(int id) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public void update(Thouse obj) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void delete(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

}
