package com.springboot.login.mapper;


import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface Common {
    @Select("select studentId from test_student where studentId=#{studentId} and studentName=#{studentName}")
    public String login(@Param("studentId") String studentId, @Param("studentName") String studentName);
}
