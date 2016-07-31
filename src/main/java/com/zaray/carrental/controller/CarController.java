package com.zaray.carrental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.zaray.carrental.domain.Car;
import com.zaray.carrental.repository.CarRepository;

@Controller
public class CarController {
	
	@Autowired
	private CarRepository carRepository;
	
	@RequestMapping(value = "/carList", method = RequestMethod.GET)
	public ModelAndView showAllCars(ModelMap map) {		
		Iterable<Car> carList = carRepository.findAll();
		map.addAttribute("carList", carList);
		  return new ModelAndView("carList", map);
	}
	
	@RequestMapping(value = "/showCar", method = RequestMethod.GET)
	public String getShowEachCar(Model model, @RequestParam("id") Long carId) {
		Car thisCar = carRepository.findOne(carId);
		model.addAttribute("car", thisCar);
		return "eachCar";
	}
	
	@RequestMapping(value = "/showCar", method = RequestMethod.POST)
	public String postRentEachCar(@RequestParam("id") Long carId, @ModelAttribute Car newCar, Model model) {
		Car createCar = new Car();
		createCar = carRepository.findOne(carId);
		createCar.setCarIsAvailable(false);
		carRepository.delete(carRepository.findOne(carId));
		carRepository.save(createCar);
		return "redirect:carList";
	}


}
