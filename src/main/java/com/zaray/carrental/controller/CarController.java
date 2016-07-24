package com.zaray.carrental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.zaray.carrental.domain.Car;
import com.zaray.carrental.repository.CarRepository;

@Controller
public class CarController {
	
	@Autowired
	public CarRepository carRepository;
	
	@RequestMapping(value = "/carList", method = RequestMethod.GET)
	public ModelAndView showAllCars(ModelMap map) {		
		Iterable<Car> carList = carRepository.findAll();
		map.addAttribute("carList", carList);
		  return new ModelAndView("carList", map);
	}


}
