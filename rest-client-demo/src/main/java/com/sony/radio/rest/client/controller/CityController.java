/**
 * @author Ajit Kumar Giri
 * 07-May-2015
 */
package com.sony.radio.rest.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sony.radio.rest.client.domain.City;
import com.sony.radio.rest.client.repo.CityRepository;

@Controller
@RequestMapping(value="/rest/ez/city")
public class CityController {

	@Autowired
	public CityRepository cityRepository;

	
	
	@RequestMapping(value=RestURIConstants.EZ_CITY_ALL)
	public @ResponseBody List<City> getAllCities() {
		List<City> cityList = cityRepository.findAll();
		return cityList;
	}
}
