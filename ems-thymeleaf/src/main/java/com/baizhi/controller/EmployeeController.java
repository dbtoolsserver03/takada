package com.baizhi.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baizhi.entity.original.Employee;
import com.baizhi.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("employee")
@Slf4j
public class EmployeeController {

    private EmployeeService service;

    @Autowired
    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    /**
     * 删除员工信息
     * @param id
     * @return
     */
    @RequestMapping("delete")
    // 方法名写什么都可以，主要看方法上面的@RequestMapping是什么
    public String delete1(Integer id){
    	
        log.debug("删除的员工id: {}",id);
        // 删除数据;
        service.delete(id);

        return "redirect:/employee/lists";//跳转到员工列表
    }

    /**
     * 更新员工信息
     *
     * @param employee
     * @param img
     * @return
     */
    @RequestMapping("update")
    public String update(Employee employee, Model model) throws IOException {

        log.debug("更新之后员工信息: id:{},姓名:{},工资:{},生日:{},", employee.getId(), employee.getName(), employee.getSalary(), employee.getBirthday());

        
        // 直接更新基本信息
        service.update(employee);
        return "redirect:/employee/lists";//更新成功,跳转到员工列表
    }

    /**
     * 根据id查询员工详细信息
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("detail")
    public String detail(Integer id, Model model) {
        log.debug("当前查询员工id: {}", id);
        //1.根据id查询一个
        Employee employee = service.findById(id);
        model.addAttribute("obj", employee);
        return "emp/updateEmp";//跳转到更新页面
    }

    /**
     * 保存员工信息
     * 文件上传: 1.表单提交方式必须是post  2.表单enctype属性必须为 multipart/form-data
     *
     * @return
     */
    @RequestMapping("save")
    public String save(Employee employee, Model model) throws IOException {
        log.debug("姓名:{}, 薪资:{}, 生日:{} ", employee.getName(), employee.getSalary(), employee.getBirthday());

        if(employee.getSalary()<0) {
        	model.addAttribute("error", "工资不可以为负数！");
            return "emp/updateEmp";//更新成功,跳转到员工列表
        }
        
        service.save(employee);
        return "redirect:/employee/lists";//保存成功跳转到列表页面
    }

    /**
     * 员工列表
     *
     * @return
     */
    @RequestMapping("lists")
    public String lists(Model model) {
        log.debug("查询所有员工信息");
        List<Employee> objList = service.lists();
        model.addAttribute("objLst", objList);
        return "emp/emplist";
    }
}
