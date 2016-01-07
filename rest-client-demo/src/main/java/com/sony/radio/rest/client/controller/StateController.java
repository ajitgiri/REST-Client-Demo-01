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

import com.sony.radio.rest.client.domain.State;
import com.sony.radio.rest.client.repo.StateRepository;

@Controller
public class StateController {

	@Autowired
	private StateRepository stateRepository;

	@RequestMapping(value = RestURIConstants.EZ_STATE_ALL, method = RequestMethod.GET)
	public @ResponseBody List<State> getAllStates() {
		List<State> stateList = stateRepository.findAll();
		return stateList;
	}
}
