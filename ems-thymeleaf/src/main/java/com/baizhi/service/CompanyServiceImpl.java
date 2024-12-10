package com.baizhi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baizhi.dao.original.TCompanyMapper;
import com.baizhi.entity.original.TCompany;
import com.baizhi.entity.original.TCompanyExample;

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

	@Override
	public TCompany getOneObj(Integer id) {
		TCompany obj = mapper.selectByPrimaryKey(id);
		return obj;
	}

	@Override
	public void update(TCompany obj) {
		mapper.updateByPrimaryKeySelective(obj);
	}

	@Override
	public void delete(Integer id) {
		mapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public List<TCompany> findRecByNm(String name) {
		

		TCompanyExample example = new TCompanyExample();
		example.createCriteria().andNameEqualTo(name);
		
		return mapper.selectByExample(example);
	}

}
