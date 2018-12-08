package com.ssm.service.impl;

import com.ssm.entity.ShuDong;

import java.util.List;

public interface ShuDongService {
    public List<ShuDong> queryAll();
    public int insertShuDong();
}
