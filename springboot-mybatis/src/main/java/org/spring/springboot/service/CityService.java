package org.spring.springboot.service;

import org.spring.springboot.domain.City;

import java.util.List;

/**
 * 城市业务逻辑接口类
 *
 * Created by bysocket on 07/02/2017.
 */

public interface CityService {

    /**
     * 根据城市名称，查询城市信息
     * @param cityName
     */
//    City findCityById(int id);
    List<City> findAllCity();
    int insertCity(City city);
    City findCityById(int id);
    int updateCity(City city);
    int deleteCity(int id);
}
