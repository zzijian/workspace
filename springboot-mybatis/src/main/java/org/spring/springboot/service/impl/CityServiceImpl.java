package org.spring.springboot.service.impl;

import org.spring.springboot.dao.CityDao;
import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 城市业务逻辑实现类
 *
 * Created by bysocket on 07/02/2017.
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    public City findCityById(int id) {
        return cityDao.findCityById(id);
    }

    public int updateCity(City city) {
        return cityDao.updateCity(city);
    }

    public int deleteCity(int id) {
        return cityDao.deleteCity(id);
    }

    public List<City> findAllCity(){
        return cityDao.findAllCity();
    }

    public int insertCity(City city) {
        return cityDao.insertCity(city);
    }

}
