package com.ketai.service;


import com.ketai.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getUserList();

    public Integer updatePwd(Integer id,String pwd);
}
