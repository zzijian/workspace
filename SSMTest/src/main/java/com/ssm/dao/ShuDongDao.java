package com.ssm.dao;

import com.ssm.entity.ShuDong;

import java.util.List;

public interface ShuDongDao {
   public List<ShuDong> queryAll();
   public int insertShuDong();
}
