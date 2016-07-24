package com.zaray.carrental.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zaray.carrental.domain.Car;
import com.zaray.carrental.repository.CarRepository;

@Controller
public class LoginController {
	
	@Autowired
	public CarRepository carRepository;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {	
		Car car = new Car();
               car.setCarId(1);
               car.setCarName("Ford");
               car.setCarProductionYear(1993);
               car.setRentPrice(1200);
               carRepository.save(car);
		return "login";
	}

}
