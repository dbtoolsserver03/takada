package com.baizhi.service;

import java.nio.charset.StandardCharsets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;
import org.springframework.util.ObjectUtils;

import com.baizhi.dao.UserDao;
import com.baizhi.dao.original.TUserMapper;
import com.baizhi.entity.User;
import com.baizhi.entity.original.TUserExample;

@Service
@Transactional
public class UserServiceImpl  implements UserService{

    private UserDao userDao;
    private  TUserMapper userMapper;
    @Autowired
    public UserServiceImpl(UserDao userDao,TUserMapper userMapper) {
        this.userDao = userDao;
        this.userMapper = userMapper;
    }
    
    @Override
    public long findUserName(String username) {
        //1.根据用户名查询用户
    	TUserExample cond = new TUserExample();
    	TUserExample.Criteria criteria = cond.createCriteria();
		criteria.andUsernameEqualTo(username);

    	long cnt = userMapper.countByExample(cond);
        return cnt;
    }
    

    @Override//xiaochen  123 ====>     xiaochen   xxed
    public User login(String username, String password) {
        //1.根据用户名查询用户
        User user = userDao.findByUserName(username);
        if(ObjectUtils.isEmpty(user)) throw new RuntimeException("用户名不正确!");
        //2.比较密码
        String passwordSecret = DigestUtils.md5DigestAsHex(password.getBytes(StandardCharsets.UTF_8));
        if(!user.getPassword().equals(passwordSecret)) throw new RuntimeException("密码输入错误!");
        return user;
    }

    @Override
    public void register(User user) {
        //1.根据用户名查询数据库中是否存在改用户
        User userDB = userDao.findByUserName(user.getUsername());
        //2.判断用户是否存在
        if(!ObjectUtils.isEmpty(userDB)) throw new RuntimeException("当前用户名已被注册!");
        //3.注册用户&明文的密码加密  特点: 相同字符串多次使用md5就行加密 加密结果始终是一致
        String newPassword = DigestUtils.md5DigestAsHex(user.getPassword().getBytes(StandardCharsets.UTF_8));
        user.setPassword(newPassword);
        userDao.save(user);
    }
}
