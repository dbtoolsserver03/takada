package com.baizhi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baizhi.entity.original.rent;

@Service
@Transactional
public class RentServiceImpl implements RentService {

	@Autowired
	rentMapper mapper;

	@Override
	public List<rent> lists() {
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
	public void save(rent obj) {
		// TODO 自動生成されたメソッド・スタブ
	   mapper.insertSelective(obj);
	   
	}

	@Override
	public rent findRecByPk(int id) {
		// TODO 自動生成されたメソッド・スタブ
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public void update(rent obj) {
		// TODO 自動生成されたメソッド・スタブ
		mapper.updateByPrimaryKeySelective(obj);
	}

	@Override
	public void delete(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		mapper.deleteByPrimaryKey(id);
	}

}
