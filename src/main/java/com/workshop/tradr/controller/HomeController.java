package com.workshop.tradr.controller;

import java.sql.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.workshop.tradr.team5.Customer;
import com.workshop.tradr.team5.DAO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController
{

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	public String home(final Locale locale, final Model model)
	{
		HomeController.logger.info("Logged");
		return "home";
	}
	
	@RequestMapping(value = { "/reg" }, method = RequestMethod.GET)
	public String reg(final Locale locale, final Model model)
	{
		HomeController.logger.info("Logged");
		return "register";
	}
	
	@RequestMapping(value = {"/","/register" }, method = RequestMethod.POST)
	public String register(final Locale locale, final Model model,@RequestParam("name") String n1,
			@RequestParam("lname") String n2,
			@RequestParam("lpassword") String n3,
			@RequestParam("secret_ques") String n4,
			@RequestParam("answer") String n5,
			@RequestParam("dob") String n6,
			@RequestParam("gender") String n7,
			@RequestParam("house_id") String n8,
			@RequestParam("invest_id") String n9
				) throws ClassNotFoundException
	{
		HomeController.logger.info("Logged");
		
		Customer obj = new Customer(n1,n2,n3,n4,n5,n6,n7,n8,n9);
		
//		Customer obj = new Customer("Akshay Kumar", "AkshayK", "twinkle", "Profession", "Acting", "1992-04-12" ,"m", "Hotel", "1");
		
		DAO database = new DAO();
		database.addCustomer(obj);
		
		return "login";
	}
	
	
	/**
	 * 
	 * @param locale
	 * @param model
	 * @return
	 */
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(final Locale locale, final Model model)
	{
		HomeController.logger.info("Logged");

		return "login";
	}
	
	@RequestMapping(value = "/forgotpwd", method = RequestMethod.GET)
	public String forgotpwd(final Locale locale, final Model model)
	{
		HomeController.logger.info("Logged");

		return "forgotpwd";
	}
		
	@RequestMapping(value = "/resetpwd", method = RequestMethod.GET)
	public String resetpwd(final Locale locale, final Model model)
	{
		HomeController.logger.info("Logged");
	
		return "resetpwd";
	}
	/**
	 * 
	 * @param locale
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/userManage", method = RequestMethod.GET)
	public String userManage(final Locale locale, final Model model)
	{
		HomeController.logger.info("Logged");

		return "about";
	}
}
