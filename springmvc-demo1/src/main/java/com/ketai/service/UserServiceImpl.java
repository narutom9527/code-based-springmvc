package com.ketai.service;

import com.ketai.entity.User;
import com.ketai.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource(name="userMapper")
    UserMapper userMapper;

    @Override
    public List<User> getUserList(){
        return userMapper.queryUserAll();
    }

    @Override
    public Integer updatePwd(Integer id, String pwd){
        return userMapper.updatePwd(id, pwd);
    }
}
