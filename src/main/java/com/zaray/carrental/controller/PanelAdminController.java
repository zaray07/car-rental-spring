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
public class PanelAdminController {

	@Autowired
	public CarRepository carRepository;

	@RequestMapping(value = "/adminPanel/addCar", method = RequestMethod.GET)
	public String getAddCarForm(@ModelAttribute("newCar") Car newCar, Model model) {
		model.addAttribute("newCar", new Car());
		return "addCar";
	}

	@RequestMapping(value = "/adminPanel/addCar", method = RequestMethod.POST)
	public String processAddCarForm(@ModelAttribute Car newCar, Model model) {
		model.addAttribute("newCar", newCar);
		carRepository.save(newCar);
		return "redirect:/carList";
	}

	@RequestMapping(value = "/adminPanel/carList", method = RequestMethod.GET)
	public ModelAndView showAllCars(ModelMap map) {
		Iterable<Car> carList = carRepository.findAll();
		map.addAttribute("carList", carList);
		return new ModelAndView("carAdminList", map);
	}

	@RequestMapping(value = "/adminPanel/editCar", method = RequestMethod.GET)
	public String getFormEditCar(Model model, @RequestParam("id") Long carId) {
		Car thisCar = carRepository.findOne(carId);
		model.addAttribute("car", thisCar);
		return "editCar";
	}

	@RequestMapping(value = "/adminPanel/editCar", method = RequestMethod.POST, params="edit")
	public String processFormEditCar(@RequestParam("id") Long carId, @ModelAttribute Car newCar, Model model) {
		carRepository.delete(carRepository.findOne(carId));
		model.addAttribute("car", newCar);
		carRepository.save(newCar);
		return "redirect:/adminPanel/carList";
	}
	
	@RequestMapping(value = "/adminPanel/editCar", method = RequestMethod.POST, params="delete")
	public String processFormDeleteCar(@RequestParam("id") Long carId) {
		carRepository.delete(carRepository.findOne(carId));
		return "redirect:/adminPanel/carList";
	}

}
