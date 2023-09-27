package com.baizhi.service;

import com.baizhi.dao.UserDAO;
import com.baizhi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import java.util.Date;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public User login(User user) {
        //1.根据用户输入用户名进行查询
        User userDB = userDAO.findByUserName(user.getUsername());
        if(!ObjectUtils.isEmpty(userDB)){
            //2.比较密码
            if (userDB.getPassword().equals(user.getPassword())) {
                return  userDB;
            }else{
                throw new RuntimeException("密码输入不正确!");
            }
        }else{
            throw  new  RuntimeException("用户名输入错误!");
        }
    }

    @Override
    public void register(User user) {
        //0.根据用户输入用户名判断用户是否存在
        User userDB = userDAO.findByUserName(user.getUsername());
        if(userDB==null){
            //1.生成用户状态
            user.setStatus("已激活");
            //2.设置用户注册时间
            user.setRegisterTime(new Date());
            //3.调用DAO
            userDAO.save(user);
        }else{
            throw new RuntimeException("用户名已存在!");
        }
    }
}
