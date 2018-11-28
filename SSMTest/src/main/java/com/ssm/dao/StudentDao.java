package com.ssm.dao;

import com.ssm.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
    Student queryByid(long id);
    List<Student> queryAll();
    int insertStudent(@Param("id") long id, @Param("name") String name);
    int updateStudent(@Param("id") long id, @Param("name") String name);
    int deleteStudent(@Param("id") long id);
}
