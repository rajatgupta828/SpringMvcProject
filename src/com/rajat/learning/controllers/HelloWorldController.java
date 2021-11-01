package com.rajat.learning.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	// Need a controller to show the initial form

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	// Process the form

	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworldpage";
	}

	@RequestMapping("/showFormModel")
	public String showFormModel() {
		return "helloworld-form-model";
	}

	@RequestMapping("/showFormRequestModel")
	public String showFormRequestModel1() {
		return "helloworld-form-request-form";
	}

	// Process Data and add to the model
	@RequestMapping("/processFormHtmlData")
	public String letsShoutDude(HttpServletRequest httpServletRequest, Model model) {

		String name = httpServletRequest.getParameter("studentName");
		name = name.toUpperCase();
		model.addAttribute("Name", name);
		model.addAttribute("JSP", "helloworldmodel");
		model.addAttribute("method_Name", "letsShoutDude");
		model.addAttribute("path_Name", "processFormHtmlData");
		model.addAttribute("RequestForm", "showFormModel");
		return "helloworldmodel";
	}

	// Process Data and add to the model
	@RequestMapping("/processUsingRequestParm")
	public String getRequestParmData(@RequestParam("studentName") String name, Model model) {

		name = name.toUpperCase();
		model.addAttribute("Name", name);
		model.addAttribute("JSP", "helloworldrequestparam");
		model.addAttribute("method_Name", "getRequestParmData");
		model.addAttribute("path_Name", "processUsingRequestParm");
		model.addAttribute("RequestForm", "showFormModel");
		return "helloworldrequestparam";
	}

}
