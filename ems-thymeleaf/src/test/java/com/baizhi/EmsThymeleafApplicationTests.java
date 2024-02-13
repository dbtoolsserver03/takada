package com.baizhi;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.baizhi.dao.original.EmployeeMapper;
import com.baizhi.entity.original.Employee;
import com.baizhi.service.EmployeeService;

@SpringBootTest
class EmsThymeleafApplicationTests {

	@Autowired
	private ApplicationContext applicationContext;

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private EmployeeMapper employeeMapper;

	@Test
	void contextLoads() {

		for (String name : applicationContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}
		
		List<Employee> serviceEmpLst = employeeService.lists();
		for (Employee employee : serviceEmpLst) {
			System.out.println(employee.getName());
		}
		
		List<Employee> daoEmpLst = employeeMapper.selectByExample(null);

		for (Employee employee : daoEmpLst) {
			System.out.println(employee.getName());
		}
		
//		UniqloExample example = new UniqloExample();
//		UniqloExample.Criteria criteria = example.createCriteria();
//		criteria.andIdEqualTo(1001);
//		
//		//List<Uniqlo> daoUniqloLst = uniqloMapper.selectByExample(example);
//
//		Uniqlo uniqlo = uniqloMapper.selectByPrimaryKey(1001);
//		System.out.println(uniqlo);

	}
}
