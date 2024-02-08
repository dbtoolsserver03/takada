package com.baizhi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baizhi.dao.original.EmployeeMapper;
import com.baizhi.entity.original.Employee;

@Service
@Transactional
public class Employee02ServiceImpl  implements  Employee02Service{

    private EmployeeMapper employeeMapper;

    @Autowired
    public Employee02ServiceImpl(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

    @Override
    public void delete(Integer id) {
    	employeeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Employee employee) {
    	employeeMapper.updateByPrimaryKeySelective(employee);
    }

    @Override
    public Employee findById(Integer id) {
        return employeeMapper.selectByPrimaryKey(id);
    }

    @Override
    public void save(Employee employee) {
    	employeeMapper.insertSelective(employee);
    }

    @Override
    public List<Employee> lists() {
        return employeeMapper.selectByExample(null);
    }
}
