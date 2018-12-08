package org.spring.springboot.dao;

import org.spring.springboot.domain.ShuDong;

import java.util.List;

public interface ShuDongDao {
    public List<ShuDong> queryAll();
    public int insertShuDong(ShuDong shuDong);
}
