package com.springboot.login.server;

import com.springboot.login.mapper.Common;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonService {
    @Autowired
    public Common commonMapper;

    public String login(String studentId, String studentName){
        return commonMapper.login(studentId, studentName);
    }
}
