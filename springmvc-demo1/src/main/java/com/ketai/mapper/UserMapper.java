package com.ketai.mapper;


import com.ketai.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;


public interface UserMapper {

    @Select("select * from smbms_user")
    List<User> queryUserAll();

    @Update("update smbms_user set userPassword = #{pwd} where id = #{id}")
    Integer updatePwd(@Param("id") Integer id, @Param("pwd") String pwd);
}
