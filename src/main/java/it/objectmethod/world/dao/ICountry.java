package it.objectmethod.world.dao;

import java.util.List;

import it.objectmethod.world.model.Country;

public interface ICountry {
	
	public List<Country> viewContinentByNameAndContinent(String nameCountry, String nameContinent);
	
	public List<Country> printContinent();
	
	public List<Country> printContinentInfo(String nomeContinente);
	

}
