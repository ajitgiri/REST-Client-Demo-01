/**
 * @author Ajit Kumar Giri
 * 07-May-2015
 */
package com.sony.radio.rest.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sony.radio.rest.client.domain.Country;
import com.sony.radio.rest.client.repo.CountryRepository;

@Controller
public class CountryController {

	@Autowired
	private CountryRepository countryRepository;

	@RequestMapping(value=RestURIConstants.EZ_COUNTRY_ALL, method= RequestMethod.GET)
	public @ResponseBody List<Country> getCountryList() {
		List<Country> countryList = countryRepository.findAll();
		return countryList;
	}
}
