package com.springboot.login.server;

import com.springboot.login.entity.User;
import com.springboot.login.mapper.Common;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonService {
    @Autowired
    public Common commonMapper;

    public User login(String userId, String userName){



        return commonMapper.login(userId,userName);
    }
}
