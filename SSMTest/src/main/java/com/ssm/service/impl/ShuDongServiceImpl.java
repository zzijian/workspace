package com.ssm.service.impl;

import com.ssm.dao.ShuDongDao;
import com.ssm.entity.ShuDong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShuDongServiceImpl implements ShuDongService {

    @Autowired
    private ShuDongDao shuDongDao;

    @Override
    public List<ShuDong> queryAll() {
        return shuDongDao.queryAll();
    }

    @Override
    public int insertShuDong() {
        return shuDongDao.insertShuDong();
    }
}
