package com.example.EmployeesCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.EmployeesCrud.domain.Employees;
import com.example.EmployeesCrud.services.EmployeesService;

@RestController
public class EmployeesController {

	@Autowired
	private EmployeesService service;

//	@GetMapping("/")
//	public List<Employees> viewHomePage(Model model) {
//		List<Employees> listemployee = service.listAll();
//		model.addAttribute("listemployee", listemployee);
//		System.out.print("Get / ");
//		return service.listAll();
//	}

	@GetMapping("/abc")
	public List<Employees> listAll() {
		return service.listAll();
	}

	/*
	 * @GetMapping("/new") public String add(Model model) {
	 * model.addAttribute("employee", new Employees()); return "new"; }
	 */

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<String> saveEmployee(@RequestBody Employees emp) {
		service.save(emp);
		String msg="success";
		return new ResponseEntity<String>(msg,HttpStatus.OK) ;
	}

	@PutMapping("/edit/{id}")
	public Employees showEditEmployeePage(@RequestBody Employees newemp , @PathVariable(name = "id") int id) {
		Employees emp = service.get(id);
		emp.setEmployeename(newemp.getEmployeename());
		service.save(emp);
		return emp;

	}

	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public String deleteemployee(@PathVariable(name = "id") int id) {
		service.delete(id);
		return "redirect:/";
	}
}
