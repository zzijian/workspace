package com.zzj.service.impl;

import com.zzj.dao.DoLoginDao;
import com.zzj.dao.impl.DoLoginDaoImpl;
import com.zzj.pojo.User;
import com.zzj.service.DoLoginService;

public class DoLoginServiceImpl implements DoLoginService {
    DoLoginDao doLoginDao = new DoLoginDaoImpl();

    @Override
    public User checkLoginService(String uname, String pwd) {
        return doLoginDao.checkLoginDao(uname,pwd);
    }
}
