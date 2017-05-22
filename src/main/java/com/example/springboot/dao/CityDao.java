package com.example.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.springboot.domain.City;

/**
 * 城市 Dao 接口类
 * @author MILO
 * Created by bysocket on 17/5/21.
 */
public interface CityDao {
	/**
	 * 获取城市信息列列表
	 * @return
	 */
	List<City> findAllCity();
	/**
	 * 根据城市编号获取城市信息
	 * @param id
	 * @return
	 */
	City findCityById(@Param("id") Long id);
	/**
	 * 新增城市信息
	 * @param city
	 * @return
	 */
	Long saveCity(City city);
	/**
	 * 根据城市编号删除城市信息
	 * @param id
	 * @return
	 */
	Long deleteCityById(Long id);
	/**
	 * 根据城市编号修改城市信息
	 * @param city
	 * @return
	 */
	Long updateCityById(City city);
}
