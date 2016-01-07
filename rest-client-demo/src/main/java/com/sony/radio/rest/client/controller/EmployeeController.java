/**
 * @author Itopia
 * 27-Apr-2015
 */
package com.sony.radio.rest.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.sony.radio.rest.client.domain.Employee;
import com.sony.radio.rest.client.repo.EmployeeRepository;

/**
 * @author Itopia
 *
 */

@Controller
public class EmployeeController {

	Employee emp = new Employee();

	@Autowired
	EmployeeRepository employeeRepository;

	@RequestMapping(value = RestURIConstants.DUMMY_FRM, method = RequestMethod.GET)
	public String showForm(Model model) {
		String response = "empDetails";
		model.addAttribute("mappedModel", emp);
		return response;
	}

	@RequestMapping(value = RestURIConstants.CREATE_EMP, method = RequestMethod.POST)
	public String addEmployee(@ModelAttribute("mappedModel") Employee mappedModel) {
		String response = "created empDetails";
		mappedModel.setName("fresher");
		mappedModel.setAge(22);
		employeeRepository.save(mappedModel);
		return response;
	}

// getting all the Employee Details
	@SuppressWarnings("unused")
	@RequestMapping(value = RestURIConstants.GET_ALL_EMP)
	public @ResponseBody List<Employee> getAll() {
		 RestTemplate restTemplate = new RestTemplate();
		// List<LinkedHashMap> emps = restTemplate.getForObject(SERVER_URI+EmpRestURIConstants.GET_ALL_EMP,List.class);
		List<Employee> empLST = employeeRepository.findAll();
		return empLST;
	}
	// getting Employee Details by Id
	@RequestMapping(value = RestURIConstants.GET_EMP, method = RequestMethod.GET)
	public @ResponseBody Employee getById(@PathVariable("id") Integer id) {
		System.out.println("id--------->>"+id);
		Employee emp = employeeRepository.findById(id);
		System.out.println("emp---"+emp);
		return emp;
		/*String JSONString = "";
		Employee emp = employeeRepository.findById(id);
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			JSONString = objectMapper.writeValueAsString(emp);
		} catch (Exception ex) {
			System.out.println("exception-json---" + ex);
		}
		return JSONString;*/
	}
}
