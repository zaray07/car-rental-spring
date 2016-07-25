package com.zaray.carrental.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zaray.carrental.domain.Car;
import com.zaray.carrental.repository.CarRepository;

@Controller
public class PanelAdminController {
	
	@Autowired
	public CarRepository carRepository;
	
	@RequestMapping(value = "/adminPanel/addCar", method = RequestMethod.GET)
	public String getAddCarForm(@ModelAttribute("newCar") Car newCar, Model model){		
	model.addAttribute("newCar", new Car());
		return "addCar";
	}
	
	@RequestMapping(value = "/adminPanel/addCar", method = RequestMethod.POST)
	public String processAddCarForm(@ModelAttribute Car newCar, Model model) {	
		 model.addAttribute("newCar", newCar);
		 System.out.println(newCar.getCarId() + " test " + newCar.getCarProductionYear());
		carRepository.save(newCar);		
		return "redirect:/carList";
	}

}
