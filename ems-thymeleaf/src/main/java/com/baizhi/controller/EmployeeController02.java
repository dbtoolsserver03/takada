package com.baizhi.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.baizhi.entity.original.Employee;
import com.baizhi.service.EmployeeService;

import cn.hutool.core.util.StrUtil;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("employee02")
@Slf4j
public class EmployeeController02 {

    private EmployeeService service;

    @Value("${upload.dir}")
    private String realpath;

    @Autowired
    public EmployeeController02(EmployeeService service) {
        this.service = service;
    }


    /**
     * 删除员工信息
     * @param id
     * @return
     */
    @RequestMapping("delete")
    // 方法名写什么都可以，主要看方法上面的@RequestMapping是什么
    public String delete(Integer id){
    	
        log.debug("删除的员工id: {}",id);
        //1.删除数据
        String photo = service.findById(id).getPhoto();
        service.delete(id);
        //2.删除头像
        File file = new File(realpath, photo);
        if (file.exists()) file.delete();
        return "redirect:/employee02/lists";//跳转到员工列表
    }

    /**
     * 更新员工信息
     *
     * @param employee
     * @param img
     * @return
     */
    @RequestMapping("update")
    public String update(Employee employee, MultipartFile img,Model model) throws IOException {

        log.debug("更新之后员工信息: id:{},姓名:{},工资:{},生日:{},", employee.getId(), employee.getName(), employee.getSalary(), employee.getBirthday());
        //1.判断是否更新头像
        boolean notEmpty = !img.isEmpty();
        log.debug("是否更新头像: {}", notEmpty);
        if (notEmpty) {
            //1.删除老的头像 根据id查询原始头像
            String oldPhoto = service.findById(employee.getId()).getPhoto();
            if(!StrUtil.isBlank(oldPhoto)) {
                File file = new File(realpath, oldPhoto);
                if (file.exists()) file.delete();//删除文件
            }
            //2.处理新的头像上传
            String originalFilename = img.getOriginalFilename();
            String newFileName = uploadPhoto(img, originalFilename);
            //3.修改员工新的头像名称
            employee.setPhoto(newFileName);
        }
        
        //2.没有更新头像直接更新基本信息
        service.update(employee);
        return "redirect:/employee02/lists";//更新成功,跳转到员工列表
    }

    //上传头像方法
    private String uploadPhoto(MultipartFile img, String originalFilename) throws IOException {
        String fileNamePrefix = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
        String fileNameSuffix = originalFilename.substring(originalFilename.lastIndexOf("."));
        String newFileName = fileNamePrefix + fileNameSuffix;
        img.transferTo(new File(realpath, newFileName));
        return newFileName;
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
        return "emp02/updateEmp";//跳转到更新页面
    }

    /**
     * 保存员工信息
     * 文件上传: 1.表单提交方式必须是post  2.表单enctype属性必须为 multipart/form-data
     *
     * @return
     */
    @RequestMapping("save")
    public String save(Employee employee, MultipartFile img,Model model) throws IOException {
        log.debug("姓名:{}, 薪资:{}, 生日:{} ", employee.getName(), employee.getSalary(), employee.getBirthday());
        String originalFilename = img.getOriginalFilename();
        log.debug("头像名称: {}", originalFilename);
        log.debug("头像大小: {}", img.getSize());
        log.debug("上传的路径: {}", realpath);

        //1.处理头像的上传&修改文件名称
        String newFileName = uploadPhoto(img, originalFilename);
        //2.保存员工信息
        employee.setPhoto(newFileName);//保存头像名字
        
        if(employee.getSalary()<0) {
        	model.addAttribute("error", "工资不可以为负数！");
            return "emp/updateEmp";//更新成功,跳转到员工列表
        }
        
        service.save(employee);
        return "redirect:/employee02/lists";//保存成功跳转到列表页面
    }

    /**
     * 员工列表
     *
     * @return
     */
    @RequestMapping("lists")
    public String lists(Model model) {
        log.debug("查询所有员工信息");
        List<Employee> objLst = service.lists();
        model.addAttribute("objLst", objLst);
        return "emp02/emplist";
    }
}
