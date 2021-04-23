package it.objectmethod.world.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.objectmethod.world.dao.ICountry;
import it.objectmethod.world.model.Country;

@Controller
public class ContinentController {

	@Autowired
	private ICountry countryDao;
	
	
	@PostMapping("/viewCountry")
	public String printCountryAndContinent(@RequestParam("countrytName") String nameContinent,@RequestParam("continentName") String nameCountry, ModelMap map) {
		List<Country> countryList = countryDao.viewContinentByNameAndContinent(nameContinent, nameCountry);
		map.addAttribute("contryPrinted", countryList);
		return "printcountry";
	}
	@GetMapping("/viewCountry")
	public String viewCountry() {
		return "printcountry";
	}
	
	
	
	@PostMapping("/printContinent")
	public String printContinent(ModelMap map) {
		List<Country> continentList = countryDao.printContinent();
		map.addAttribute("continentPrinted", continentList);
		return "printallcontinent";
	}
	@GetMapping("/printContinent")
	public String viewAllContinent() {
		return "printallcontinent";
	}
	
	
	@GetMapping("/viewCountryByContinent")
	public String printCountryByContinent(@RequestParam("continentName") String continentCode, ModelMap map) {
	List<Country>countryInfoList= countryDao.printContinentInfo(continentCode);
	map.addAttribute("countryInfo",countryInfoList);
		return "infocountry";
	}
	
	
	

}
