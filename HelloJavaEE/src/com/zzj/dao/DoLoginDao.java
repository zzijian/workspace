package com.zzj.dao;

import com.zzj.pojo.User;

public interface DoLoginDao {
    User checkLoginDao(String uname, String pwd);
}
