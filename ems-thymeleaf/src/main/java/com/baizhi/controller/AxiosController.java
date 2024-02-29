package com.baizhi.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baizhi.entity.original.Employee;
import com.baizhi.entity.vo.EmployeeVo;
import com.baizhi.service.EmployeeService;

@Controller
@RequestMapping("axios")
public class AxiosController {

	@Autowired
	private EmployeeService service;

	@GetMapping("getAll")
	@ResponseBody
	//@CrossOrigin //允许请求跨域
	public List<Employee> getAll() {
		return service.lists();
	}
	@GetMapping("getCnt")
	@ResponseBody
	//@CrossOrigin //允许请求跨域
	public Integer getCnt() {
		return 12345;
	}
	@GetMapping("getEmp")
	@ResponseBody
	//@CrossOrigin //允许请求跨域
	public List<Employee> getEmp(String name, Double salaryBegin, Date birthdayBegin) {
		System.out.println("name:" + name);
		System.out.println("salaryBegin:" + salaryBegin);
		System.out.println("birthdayBegin:" + birthdayBegin);

		EmployeeVo vo = new EmployeeVo();
		vo.setObj(new Employee());
		vo.getObj().setName(name);
		vo.setSalaryBegin(salaryBegin);
		vo.setBirthdayBegin(birthdayBegin);
		return service.lists(vo);
	}

	@PostMapping("save")
	@ResponseBody
	//@CrossOrigin //允许请求跨域
	public Map<String,Object> save() {
		
		Map<String,Object> map = new HashMap<>();
		map.put("success", true); 
		map.put("message", "save success !");
		
		return map;
	}
	@PostMapping("save01")
	@ResponseBody
	//@CrossOrigin //允许请求跨域
	public Map<String,Object> save01(String name, Double salaryBegin, Date birthdayBegin) {
		System.out.println("name:" + name);
		System.out.println("salaryBegin:" + salaryBegin);
		System.out.println("birthdayBegin:" + birthdayBegin);
		Map<String,Object> map = new HashMap<>();
		map.put("success", true);
		map.put("message", "save success !");
		
		return map;
	}
	@PostMapping("save02")
	@ResponseBody
	//@CrossOrigin //允许请求跨域
	public Map<String,Object> save02(@RequestBody EmployeeVo vo) {
		System.out.println("vo:" + vo);
		Map<String,Object> map = new HashMap<>();
		map.put("success", true);
		map.put("message", "save success !");
		
		return map;
	}
}
