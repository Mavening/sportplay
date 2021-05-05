package com.lhl.dao;

import com.lhl.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {

    User getUserByMessage(@Param("username") String username,@Param("password")String password);
}
