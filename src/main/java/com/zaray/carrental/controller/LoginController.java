package com.zaray.carrental.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.zaray.carrental.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@RequestMapping(method = RequestMethod.POST, params = "loginForm")
	public String loginFormPost( @RequestParam("userEmail") String userEmail,
			@RequestParam("userPassword") String userPassword, HttpServletRequest request, ModelAndView modelAndView) {

		boolean userExists = loginService.checkLogin(userEmail,userPassword);
	if(userExists){
	request.getSession().setAttribute("userIsLogin", "logged");
}
		
		return "redirect:/carList";
	}

}
