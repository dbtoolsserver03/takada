package com.song.controller;

import com.song.entity.Employee;
import com.song.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("employee")
public class EmployeeController {

    private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);


    private EmployeeService employeeService;

    @Value("${photo.file.dir}")
    private String realpath;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


   
    @RequestMapping("delete")
    public String delete(Integer id){
        log.debug("删除的员工id: {}",id);
     
        String photo = employeeService.findById(id).getPhoto();
        employeeService.delete(id);
     
        File file = new File(realpath, photo);
        if (file.exists()) file.delete();
        return "redirect:/employee/lists";

  apping("update")
    public String update(Employee employee, MultipartFile img) throws IOException {

        log.debug("更新之后员工信息: id:{},姓名:{},工资:{},生日:{},", employee.getId(), employee.getName(), employee.getSalary(), employee.getBirthday());
  
        boolean notEmpty = !img.isEmpty();
        log.debug("是否更新头像: {}", notEmpty);
        if (notEmpty) {
           
            String oldPhoto = employeeService.findById(employee.getId()).getPhoto();
            File file = new File(realpath, oldPhoto);
            if (file.exists()) file.delete();
         
            String originalFilename = img.getOriginalFilename();
            String newFileName = uploadPhoto(img, originalFilename);
         
            employee.setPhoto(newFileName);
        }
      
        employeeService.update(employee);
        return "redirect:/employee/lists";
    }


    private String uploadPhoto(MultipartFile img, String originalFilename) throws IOException {
        String fileNamePrefix = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
        String fileNameSuffix = originalFilename.substring(originalFilename.lastIndexOf("."));
        String newFileName = fileNamePrefix + fileNameSuffix;
        img.transferTo(new File(realpath, newFileName));
        return newFileName;
    }

    
    @RequestMapping("detail")
    public String detail(Integer id, Model model) {
        log.debug("当前查询员工id: {}", id);
     
        Employee employee = employeeService.findById(id);
        model.addAttribute("employee", employee);
        return "updateEmp";

    
    @RequestMapping("save")
    public String save(Employee employee, MultipartFile img) throws IOException {
        log.debug("姓名:{}, 薪资:{}, 生日:{} ", employee.getName(), employee.getSalary(), employee.getBirthday());
        String originalFilename = img.getOriginalFilename();
        log.debug("头像名称: {}", originalFilename);
        log.debug("头像大小: {}", img.getSize());
        log.debug("上传的路径: {}", realpath);

        
        String newFileName = uploadPhoto(img, originalFilename);
      
        employee.setPhoto(newFileName);
        employeeService.save(employee);
        return "redirect:/employee/lists";
    }

   
    @RequestMapping("lists")
    public String lists(Model model) {
        log.debug("查询所有员工信息");
        List<Employee> employeeList = employeeService.lists();
        model.addAttribute("employeeList", employeeList);
        return "emplist";
    }
}
