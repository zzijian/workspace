package com.zzj.service;

import com.zzj.pojo.User;

public interface DoLoginService {
    User checkLoginService(String uname, String pwd);
}
