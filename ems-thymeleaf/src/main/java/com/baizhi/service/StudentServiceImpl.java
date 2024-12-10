package com.baizhi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baizhi.dao.original.TStudentMapper;
import com.baizhi.entity.original.TStudent;
import com.baizhi.entity.original.TStudentExample;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	TStudentMapper mapper;

	@Override
	public List<TStudent> lists() {
		return mapper.selectByExample(null);
	}

	@Override
	public void save(TStudent obj) {
		mapper.insertSelective(obj);

	}

	@Override
	public TStudent findRecByPk(int id) {
		return mapper.selectByPrimaryKey(id);

	}

	@Override
	public void update(TStudent obj) {
		mapper.updateByPrimaryKeySelective(obj);
	}

	@Override
	public void delete(Integer id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<TStudent> findRecByNm(String nm) {
	
		TStudentExample example = new TStudentExample();
		example.createCriteria().andStudentNameEqualTo(nm);
		
		return mapper.selectByExample(example);
	}

}
