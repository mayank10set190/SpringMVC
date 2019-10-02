package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.model.Employee;


//localhost:portnub/applicationname/contlevurl/methodlelurl;


@Controller
@RequestMapping("/api")
public class EmployeeController  {
	
	public  EmployeeController() {
		System.out.println("default cons");
	}
	
	
	@GetMapping("/fc")
 public String showEmpForm(Model model ) {
	Employee emp=new Employee();
	model.addAttribute("emp", emp);
	return "EmpRegForm"; 
 }
	
	@PostMapping("/save")
	 public String AddEmpForm(@ModelAttribute("emp") Employee emp,Model model ) {
		
		model.addAttribute("emp", emp);
		return "EmpSuccessForm"; 
	 }
	
	
	
}
