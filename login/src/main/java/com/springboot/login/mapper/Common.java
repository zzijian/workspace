package com.springboot.login.mapper;


import com.springboot.login.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface Common {
    @Select("select * from user where userId=#{userId} and password=#{password}")
    public User login(@Param("userId") String userId, @Param("password") String password);
}
