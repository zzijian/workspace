package org.spring.springboot.service.impl;

import org.spring.springboot.dao.ShuDongDao;
import org.spring.springboot.domain.ShuDong;
import org.spring.springboot.service.ShuDongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
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
    public int insertShuDong(ShuDong shuDong) {
        shuDong.setDate(new Date());
        return shuDongDao.insertShuDong(shuDong);
    }
}
