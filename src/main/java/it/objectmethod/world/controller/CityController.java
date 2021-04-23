package it.objectmethod.world.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.objectmethod.world.dao.ICity;
import it.objectmethod.world.model.City;


@Controller
public class CityController {
	@Autowired
	private ICity cityDao;
		
	
	@PostMapping("/cityInfo")
	public String viewCityByame(@RequestParam("cityName")String nameCity, ModelMap map) {
		City c= cityDao.cityInfo(nameCity);
		map.addAttribute("printedCity", c);
		return "infocity";
	}
	
	@GetMapping("/cityInfo")
	public String viewCity() {
		return "infocity";
	}

	@GetMapping("/viewCityByCountry")
	public String printCity(@RequestParam("countryCode") String countrytCode, ModelMap map) {
		List<City> cityList=cityDao.printCityByCountry(countrytCode);
		map.addAttribute("printcities", cityList);
		return "printcity";
	}
	
	
}
