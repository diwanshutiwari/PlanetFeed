package com.diwanshu.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.diwanshu.shoppingBackend.dao.CategoryDao;
import com.diwanshu.shoppingBackend.dto.Category;

@Controller
public class PageController {

	@Autowired
	private CategoryDao categoryDao;

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {

		ModelAndView mav = new ModelAndView("page");

		mav.addObject("title", "Home");
		mav.addObject("categories", categoryDao.list());
		mav.addObject("userClickHome", true);
		return mav;
	}

	@RequestMapping(value = "/about")
	public ModelAndView about() {

		ModelAndView mav = new ModelAndView("page");

		mav.addObject("title", "About Us");
		mav.addObject("userClickAbout", true);
		return mav;
	}

	@RequestMapping(value = "/contact")
	public ModelAndView contact() {

		ModelAndView mav = new ModelAndView("page");

		mav.addObject("title", "Contact Us");
		mav.addObject("userClickContact", true);
		return mav;
	}

	/*
	 * Methods for Show All products based on category
	 */

	@RequestMapping(value = "/show/all/products")
	public ModelAndView showAllProducts() {

		ModelAndView mav = new ModelAndView("page");

		mav.addObject("title", "All Products");
		mav.addObject("categories", categoryDao.list());
		mav.addObject("userClickAllProduct", true);
		return mav;
	}
	
	@RequestMapping(value = "/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id) {
		
		Category category=null;
		
		category=categoryDao.get(id);
		
		
		ModelAndView mav = new ModelAndView("page");

		mav.addObject("title", category.getName());
		mav.addObject("categories", categoryDao.list());
		// passing category
		mav.addObject("category", category);
		
		mav.addObject("userClickCategoryProduct", true);
		return mav;
	}

}
