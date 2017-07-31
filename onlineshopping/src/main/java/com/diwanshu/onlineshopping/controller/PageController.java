package com.diwanshu.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {

		ModelAndView mav = new ModelAndView("page");

		mav.addObject("greeting", "Welcome to spring Mvc..!!");
		return mav;
	}

	@RequestMapping(value = "/test")
	public ModelAndView test(@RequestParam(value="greeting", required=false) String greeting) {
		if (greeting==null) {
			greeting="Something went wrong..!!";
		}
		ModelAndView mav = new ModelAndView("page");

		mav.addObject("greeting", greeting);
		return mav;
	}
	
	@RequestMapping(value = "/demo/{greeting}")
	public ModelAndView demo(@PathVariable("greeting") String greeting) {
		if (greeting==null) {
			greeting="Something went wrong..!!";
		}
		ModelAndView mav = new ModelAndView("page");

		mav.addObject("greeting", greeting);
		return mav;
	}
}
