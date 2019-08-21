package com.grandcircus.SpringDemo79;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoffeeController {

	@RequestMapping("/")
	public ModelAndView homepage() {

		return new ModelAndView("home");

	}
	@RequestMapping("/register")
	public ModelAndView registerPage() {

		return new ModelAndView("reg");

	}
	
	@RequestMapping("/submit-register")
	public ModelAndView registerUser(Register user) {

		return new ModelAndView("form-confirm", "formdeets", "Welcome, " + user.getfName());

	}
	
	
//	@RequestMapping("/login")
//	public ModelAndView registerPage1() {
//
//		return new ModelAndView("reg");
//
//	}

//	@RequestMapping("/coffee-selection")
//	public ModelAndView coffeeChoice(@RequestParam("Sign-Up") String registration,
//			@RequestParam("Login") String login) {
//
//		return new ModelAndView("coffee-confirm", "pageinfo", registration);
//	}

}
