package com.baizhi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baizhi.dao.original.SenmongakuseiMapper;
import com.baizhi.entity.original.Senmongakusei;
import com.baizhi.entity.original.SenmongakuseiExample;
import com.baizhi.entity.original.SenmongakuseiExample.Criteria;

@Service
@Transactional
public class SenmonServiceImpl implements SenmonService {

	@Autowired
	SenmongakuseiMapper mapper;

	@Override
	public List<Senmongakusei> searchList(Senmongakusei contionVo) {

		SenmongakuseiExample example = new SenmongakuseiExample();

		Criteria criteria = example.createCriteria();

		if (contionVo.getStudentName() != null && contionVo.getStudentName().length() > 0) {
			criteria.andStudentNameLike("%" + contionVo.getStudentName() + "%");
		}

		List<Senmongakusei> lst = mapper.selectByExample(example);

		return lst;
	}

	@Override
	public void addRec(Senmongakusei obj) {
		mapper.insertSelective(obj);
	}

	@Override
	public Senmongakusei getOneRec(Senmongakusei obj) {

		return mapper.selectByPrimaryKey(obj.getStudentId());
	}

	@Override
	public void updateRec(Senmongakusei obj) {
		mapper.updateByPrimaryKeySelective(obj);
	}
}
