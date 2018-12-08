package org.spring.springboot.service;

import org.spring.springboot.domain.ShuDong;

import java.util.List;

public interface ShuDongService {
    public List<ShuDong> queryAll();
    public int insertShuDong(ShuDong shuDong);
}
