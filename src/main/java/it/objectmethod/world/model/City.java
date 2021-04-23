package it.objectmethod.world.model;

public class City {
	private int idCity;
	private String cityName;
	private String countryCode;
	private String cityDistrict;
	private int cityPopulation;

	public int getIdCity() {
		return idCity;
	}

	public void setIdCity(int idCity) {
		this.idCity = idCity;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCityDistrict() {
		return cityDistrict;
	}

	public void setCityDistrict(String cityDistrict) {
		this.cityDistrict = cityDistrict;
	}

	public int getCityPopulation() {
		return cityPopulation;
	}

	public void setCityPopulation(int cityPopulation) {
		this.cityPopulation = cityPopulation;
	}
	@Override
	public String toString() {
		return idCity+"  "+cityName+"  "+countryCode+"  "+cityDistrict+"  "+cityPopulation;
	}

}
