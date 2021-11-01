package com.rajat.learning.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/about")
public class MappingExampleController {

	@RequestMapping(value = "/aboutus", method = RequestMethod.GET)
	public String showAboutUsPage() {
		return "about-us";
	}
}
