package com.baizhi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baizhi.dao.original.TCompanyMapper;
import com.baizhi.entity.original.TCompany;

@Service
@Transactional
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	TCompanyMapper mapper;

	@Override
	public List<TCompany> lists() {
		return mapper.selectByExample(null);
	}

	@Override
	public void save(TCompany obj) {
		mapper.insertSelective(obj);

	}
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

}
