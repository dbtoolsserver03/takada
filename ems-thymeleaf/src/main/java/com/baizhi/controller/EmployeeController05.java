package com.baizhi.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baizhi.entity.original.Employee;
import com.baizhi.entity.vo.EmployeeVo;
import com.baizhi.service.EmployeeService;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("employee05")
@Slf4j
public class EmployeeController05 {

    private EmployeeService service;

    @Autowired
    public EmployeeController05(EmployeeService service) {
        this.service = service;
    }
    
	/**
	 * emp列表
	 *
	 * @return
	 */
	@RequestMapping("init")
	public String init(Model model) {
		EmployeeVo vo = new EmployeeVo();
		vo.setObj(new Employee());
		model.addAttribute("vo",vo);
		
		return "emp05/emplist";
	}

	/**
	 * 员工列表
	 *
	 * @return
	 */
	@RequestMapping("searchByCondition")
	public String lists(EmployeeVo vo, Model model,HttpSession session) {
		
		List<Employee> lst = service.lists(vo);
		
		vo.setLst(lst);
		model.addAttribute("vo",vo);
		
		session.setAttribute("condEmp05", vo);
		// 检索数据库
		return "emp05/emplist";
	}
	
    /**
     * 删除员工信息
     * @param id
     * @return
     */
    @RequestMapping("deleteAll")
    // 方法名写什么都可以，主要看方法上面的@RequestMapping是什么
    public String deleteAll(EmployeeVo vo, Model model){
    	
        // 删除数据
    	
    	for(String id : vo.getSelectedItems()) {
            service.delete(Integer.parseInt(id));
    	}
        return "redirect:/employee05/lists";//跳转到员工列表
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
        return "redirect:/employee05/lists";//更新成功,跳转到员工列表
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
        return "emp05/updateEmp";//跳转到更新页面
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
            return "emp05/updateEmp";//更新成功,跳转到员工列表
        }
        
        service.save(employee);
        return "redirect:/employee05/lists";//保存成功跳转到列表页面
    }

    /**
     * 员工列表
     *
     * @return
     */
    @RequestMapping("returnToList")
    public String returnToList(Model model,HttpSession session) {
        
    	EmployeeVo vo = (EmployeeVo)session.getAttribute("condEmp05");
        
        model.addAttribute("vo",vo);
        return "emp05/emplist";
    }
    
    /**
     * 员工列表
     *
     * @return
     */
    @RequestMapping("lists")
    public String lists(Model model,HttpSession session) {
        
    	EmployeeVo vo = (EmployeeVo)session.getAttribute("condEmp05");
		List<Employee> lst = service.lists(vo);
		
		vo.setLst(lst);
        model.addAttribute("vo",vo);
        return "emp05/emplist";
    }
}
