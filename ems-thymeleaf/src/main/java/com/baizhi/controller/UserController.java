package com.baizhi.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import com.baizhi.utils.VerifyCodeUtils;

import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("user")
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    /**
     * 安全退出
     */
    @RequestMapping("logout")
    public String logout(HttpSession session){
        session.invalidate(); //session失效
        return "redirect:/employee/lists";//跳转到登录界面
    }

    /**
     * 用户登录
     * @return
     */
    @RequestMapping("login")
    public String login(String username,String password,HttpSession session){
        log.debug("本次登录用户名: {}",username);
        log.debug("本地登录密码: {}",password);
        try {
            //1.调用业务层进行登录
            User user = userService.login(username,password);
            //2.保存用户信息
            session.setAttribute("user",user);
        } catch (Exception e) {
            e.printStackTrace();
            return "redirect:/login";//登录失败回到登录界面
        }
        return "redirect:/menu";//登录成功之后,跳转到菜单画面
    }

    /**
     * 用户注册
     * @return
     */
    @RequestMapping("register")
    public String register(User user, String code,HttpSession session){
        log.debug("用户名: {},真是姓名: {},密码: {},性别: {},",user.getUsername(),user.getRealname(),user.getPassword(),user.getGender());
        log.debug("用户输入验证码: {}",code);

        try {
            //1.判断用户输入验证码和session中验证码是否一致
            String sessionCode = session.getAttribute("code").toString();
            if(!sessionCode.equalsIgnoreCase(code))throw new RuntimeException("验证码输入错误!");
            //2.注册用户
            userService.register(user);
        } catch (RuntimeException e) {
            e.printStackTrace();
            return "redirect:/register"; //注册失败回到注册
        }
        return  "redirect:/login";  //注册成功跳转到登录
    }

    /**
     * 生成验证码
     */
    @RequestMapping("generateImageCode")
    public void generateImageCode(HttpSession session, HttpServletResponse response) throws IOException {
        //1.生成4位随机数
        String code = VerifyCodeUtils.generateVerifyCode(4);
        //2.保存到session作用域
        session.setAttribute("code",code);
        //3.根据随机数生成图片 && 4.通过response响应图片  && 5.设置响应类型
        response.setContentType("image/png");
        ServletOutputStream os = response.getOutputStream();
        VerifyCodeUtils.outputImage(220,60, os,code);
    }
    
    
	@GetMapping("findUserName")
	@ResponseBody
	//@CrossOrigin //允许请求跨域
	public long findUserName(String username) throws Exception {

		long cnt =userService.findUserName(username); 
		return cnt;
	}
}
