package org.spring.springboot.dao;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.City;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 城市 DAO 接口类
 *
 * Created by bysocket on 07/02/2017.
 */
public interface CityDao {

    List<City> findAllCity();
    int insertCity(City city);
    City findCityById(int id);
    int updateCity(City city);
    int deleteCity(int id);
}
