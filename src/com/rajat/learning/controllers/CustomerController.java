package com.rajat.learning.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rajat.learning.models.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		// Create a new Student Model
		Customer theCustomer = new Customer();
		
		//Add this to the model
		
		theModel.addAttribute("customer", theCustomer);
		
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer , BindingResult bindingResult) {
		
		
		if(bindingResult.hasErrors()) {
			System.out.println("Page has errors of validations");
			return "customer-form";
		}
		// log the data
		System.out.println(" The Customer  : " + theCustomer.getFirstName() + " " + theCustomer.getLastName()
				+  " added.");

		
		return "customer-confirmation";
	}
	

}
