package com.baizhi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baizhi.dao.original.AkibaheadofficeMapper;
import com.baizhi.entity.original.Akibaheadoffice;

@Service
@Transactional
public class AkibaheadofficeServiceImpl implements  AkibaheadofficeService {

	@Autowired
	AkibaheadofficeMapper mapper;
	@Override
	public List<Akibaheadoffice> lists() {
		return mapper.selectByExample(null);
	}

	
	@Override
	public void save(Akibaheadoffice obj) {
		mapper.insertSelective(obj);

	}

	@Override
	public Akibaheadoffice findRecByPk(int id) {
		return mapper.selectByPrimaryKey(id);
	
	}

	@Override
	public void update(Akibaheadoffice obj) {
		mapper.updateByPrimaryKeySelective(obj);
	}
//
//	@Override
//	public void delete(Integer id) {
//		mapper.deleteByPrimaryKey(id);
//	}

}
