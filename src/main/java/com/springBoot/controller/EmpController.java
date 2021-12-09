package com.springBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.springBoot.model.Employee;
import com.springBoot.service.EmpService;

@Controller
public class EmpController {
	@Autowired
	private EmpService empService;
	//handler method to handle list students and return model and view.
	@GetMapping("/")
	public String listAllEmp(Model model) {
		model.addAttribute("employees",empService.getAllEmployees());
		return "employees";
	}
	@GetMapping("/home")
	public ModelAndView listAllEmp(Employee employee) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("employee",employee);
		mv.setViewName("home");				
		return mv;
	}
	@GetMapping("/updateForm/{id}")
	public String updateForm(@PathVariable(value = "id") long id,Model model) {
		Employee employee=empService.getEmployeeById(id);
		model.addAttribute("employee",employee);
		return "update_employee";
	}
}
