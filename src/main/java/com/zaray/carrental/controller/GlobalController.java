package com.zaray.carrental.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class GlobalController {
	
	@ModelAttribute
	public void addAttributes(Model model, HttpServletRequest request) {
		model.addAttribute("user", request.getSession().getAttribute("userIsLogin"));
		model.addAttribute("userName", request.getSession().getAttribute("userName"));
	}

}
