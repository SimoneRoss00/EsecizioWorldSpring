package it.objectmethod.world.dao;

import java.util.List;

import it.objectmethod.world.model.City;

public interface ICity {
	
	public City cityInfo(String name);
	
	public List<City> printCityByCountry(String countryCode);

}
