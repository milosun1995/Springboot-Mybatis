package com.example.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.domain.City;
import com.example.springboot.service.CityService;
/**
 * 城市 Controller 实现 Restful HTTP 服务
 *
 * Created by bysocket on 17/5/21.
 * 注意: 1.Spring mvc中的@PathVariable是用来获得请求url中的动态参数的
 */
@RestController
public class CityRestController {
	@Autowired
	private CityService cityService;

	@RequestMapping(value="/api/city",method=RequestMethod.GET)
	public List<City> findAllCity() {
		return cityService.findAllCity();
	}
	
	@RequestMapping(value="/api/city/{id}",method=RequestMethod.GET)
	public City findCityById(@PathVariable("id") Long id) {
		return cityService.findCityById(id);
	}
	
	@RequestMapping(value="/api/city",method=RequestMethod.POST)
	public void saveCity(City city) {
    	city.setId((long) 2);
    	city.setProvinceId((long) 2);
    	city.setCityName("新乡市");
    	city.setDescription("八里沟景区");
		cityService.saveCity(city);
	}
	
	@RequestMapping(value="/api/city",method=RequestMethod.PUT)
	public void updateCityById(City city) {
    	city.setId((long) 2);
    	city.setDescription("八里沟景区,有山，有水，有树林！");
		cityService.updateCity(city);
	}
	
	@RequestMapping(value="/api/city/{id}",method=RequestMethod.DELETE)
	public void deleteCityById(@PathVariable("id") Long id) {
		cityService.deleteCity(id);
	}

}
