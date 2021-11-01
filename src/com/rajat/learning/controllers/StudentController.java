package com.rajat.learning.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rajat.learning.models.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		// Create a new Student Model
		Student theStudent = new Student();
		
		//Add this to the model
		
		theModel.addAttribute("student", theStudent);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		
		// log the data
		System.out.println(" The student  : " + theStudent.getFirstName() + " " + theStudent.getLastName() + " added.");

		
		return "student-confirmation";
	}
	

}
