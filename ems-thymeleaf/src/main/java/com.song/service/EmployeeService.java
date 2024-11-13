package com.song.service;

import com.song.entity.Employee;

import java.util.List;

public interface EmployeeService {

  
    List<Employee> lists();

  
    void save(Employee employee);


    Employee findById(Integer id);


    void update(Employee employee);


    void delete(Integer id);
}
