package com.baizhi.entity.vo;

import java.util.Date;
import java.util.List;

import com.baizhi.entity.original.Employee;

import lombok.Data;


// 有了个这注解，就有了GET,SET方法
@Data

// Vo View  Object
public class EmployeeVo {

	public EmployeeVo() {
	}
	
	// 检索条件
	private Employee employee;
	private Double salaryBegin;
	private Double salaryEnd;
	private Date birthdayBegin;
	private Date birthdayEnd;
	private List<String> selectedItems;
	
	// 检索出来的数据
	private List<Employee> lst;
}
