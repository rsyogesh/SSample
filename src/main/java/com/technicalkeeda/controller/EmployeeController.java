package com.technicalkeeda.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.technicalkeeda.controller.Student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController{
	@RequestMapping("/employee/add.htm")
	public ModelAndView add(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		return new ModelAndView("employee", "message", "Employee Added"); 
	}
	@RequestMapping("/employee/delete.htm")
	public ModelAndView delete(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		return new ModelAndView("employee", "message", "Employee Deleted"); 
	}
	@RequestMapping("/employee/update.htm")
	public ModelAndView update(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		return new ModelAndView("employee", "message", "Employee Updated"); 
	}
	
	 @RequestMapping(value = "/employee/student.htm", method = RequestMethod.GET)
	   public ModelAndView student() {
	      return new ModelAndView("student", "command", new Student());
	   }
	   
	   @RequestMapping(value = "/employee/addStudent.htm", method = RequestMethod.POST)
	   public String addStudent(@ModelAttribute Student student, 
	   ModelMap model) {
	      model.addAttribute("name", student.getName());
	      model.addAttribute("age", student.getAge());
	      model.addAttribute("id", student.getId());
	      
	      return "result";
	   }
}
