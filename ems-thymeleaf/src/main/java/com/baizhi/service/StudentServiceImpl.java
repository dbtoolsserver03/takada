package com.baizhi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baizhi.dao.original.TStudentMapper;
import com.baizhi.entity.original.TStudent;

@Service
@Transactional
public class StudentServiceImpl  implements  StudentService{

	
	@Autowired
	TStudentMapper mapper;
	
	@Override
	public List<TStudent> lists() {
		return mapper.selectByExample(null);
	}

}
