package com.baizhi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baizhi.dao.original.EmployeeMapper;
import com.baizhi.entity.original.Employee;
import com.baizhi.entity.original.EmployeeExample;
import com.baizhi.entity.vo.EmployeeVo;

import cn.hutool.core.util.NumberUtil;
import cn.hutool.core.util.ObjUtil;
import cn.hutool.core.util.StrUtil;

@Service
@Transactional
public class EmployeeServiceImpl  implements  EmployeeService{

    private EmployeeMapper mapper;

    @Autowired
    public EmployeeServiceImpl(EmployeeMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public void delete(Integer id) {
    	mapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Employee employee) {
    	mapper.updateByPrimaryKeySelective(employee);
    }

    @Override
    public Employee findById(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public void save(Employee employee) {
    	mapper.insertSelective(employee);
    }

    @Override
    public List<Employee> lists() {
        return mapper.selectByExample(null);
    }

	@Override
	public List<Employee> lists(EmployeeVo vo) {
		EmployeeExample cond = new EmployeeExample();
		EmployeeExample.Criteria criteria = cond.createCriteria();
		
		
		// 姓名糊糊查询 条件     日语叫曖昧検索
		if( StrUtil.isNotEmpty(vo.getObj().getName())) {
			criteria.andNameLike("%" + vo.getObj().getName() + "%" );
		}
    	
		// 工资范围 条件
		if( ObjUtil.isNotNull(vo.getSalaryBegin())) {
			criteria.andSalaryGreaterThanOrEqualTo(NumberUtil.parseDouble(vo.getSalaryBegin().toString()));
			}
		if( ObjUtil.isNotNull(vo.getSalaryEnd())) {
			criteria.andSalaryLessThanOrEqualTo(NumberUtil.parseDouble(vo.getSalaryEnd().toString()));
		}
		// 生日范围 条件
		if( ObjUtil.isNotNull(vo.getBirthdayBegin())) {
			criteria.andBirthdayGreaterThanOrEqualTo(vo.getBirthdayBegin());
			}
		if( ObjUtil.isNotNull(vo.getBirthdayEnd())) {
			criteria.andBirthdayLessThanOrEqualTo(vo.getBirthdayEnd());
		}
		
        return mapper.selectByExample(cond);
	}
}
