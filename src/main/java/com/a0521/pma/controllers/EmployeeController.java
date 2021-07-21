package com.a0521.pma.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.a0521.pma.dao.EmployeeRepository;
import com.a0521.pma.entity.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository emRepo;

	@GetMapping
	public String displayEmployees(Model model) {
		List<Employee> employees = emRepo.findAll();
		model.addAttribute("employeeList", employees);
		return "employees/list-employees";
	}
	
//	@RequestMapping("/new")
	@GetMapping("/new")
	public String displayEmployeeForm(Model model) {
		model.addAttribute("employee", new Employee());
		return "employees/new-employee";
	}
	
//	@RequestMapping(value="/save", method = RequestMethod.POST)
	@PostMapping("/save")
	public String createEmployee(Employee employee, Model model) {
		//this should handle saving to the database
		emRepo.save(employee);
		
		return "redirect:/";
	}
}