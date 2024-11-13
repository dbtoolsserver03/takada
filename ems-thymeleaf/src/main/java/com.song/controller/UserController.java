package com.song.controller;

import com.song.entity.User;
import com.song.service.UserService;
import com.song.utils.VerifyCodeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping("user")
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


 
    @RequestMapping("logout")
    public String logout(HttpSession session){
        session.invalidate(); //session失效
        return "redirect:/employee/lists";//跳转到登录界面
    }

    
    @RequestMapping("login")
    public String login(String username,String password,HttpSession session){
        log.debug("本次登录用户名: {}",username);
        log.debug("本地登录密码: {}",password);
        try {
          
            User user = userService.login(username,password);
          
            session.setAttribute("user",user);
        } catch (Exception e) {
            e.printStackTrace();
            return "redirect:/login";
        }
        return "redirect:/employee/lists";
    }

   
    @RequestMapping("register")
    public String register(User user, String code,HttpSession session){
        log.debug("用户名: {},真是姓名: {},密码: {},性别: {},",user.getUsername(),user.getRealname(),user.getPassword(),user.getGender());
        log.debug("用户输入验证码: {}",code);

        try {
          
            String sessionCode = session.getAttribute("code").toString();
            if(!sessionCode.equalsIgnoreCase(code))throw new RuntimeException("验证码输入错误!");
            
            userService.register(user);
        } catch (RuntimeException e) {
            e.printStackTrace();
            return "redirect:/register";
        }
        return  "redirect:/login";  
    }

    
    @RequestMapping("generateImageCode")
    public void generateImageCode(HttpSession session, HttpServletResponse response) throws IOException {
        
        String code = VerifyCodeUtils.generateVerifyCode(4);
        
        session.setAttribute("code",code);
      
        response.setContentType("image/png");
        ServletOutputStream os = response.getOutputStream();
        VerifyCodeUtils.outputImage(220,60, os,code);
    }

}
