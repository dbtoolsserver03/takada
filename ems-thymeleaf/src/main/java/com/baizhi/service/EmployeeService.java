package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.original.Employee;
import com.baizhi.entity.vo.EmployeeVo;

public interface EmployeeService {

    //员工列表方法
    List<Employee> lists();

    //员工列表方法
    List<Employee> lists(EmployeeVo vo);
    
    //保存员工信息
    void save(Employee employee);

    //根据id查询一个
    Employee findById(Integer id);

    //更新员工信息
    void update(Employee employee);

    //删除员工信息
    void delete(Integer id);
}
