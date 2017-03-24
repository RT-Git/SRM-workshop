package com.workshop.tradr.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	@RequestMapping(value = {"/register" }, method = RequestMethod.GET)
	public String register(final Locale locale, final Model model)
	{
		HomeController.logger.info("Logged");
		return "register";
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
	}@RequestMapping(value = "/forgotpwd", method = RequestMethod.GET)
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
