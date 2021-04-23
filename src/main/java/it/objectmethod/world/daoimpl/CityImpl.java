package it.objectmethod.world.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import it.objectmethod.world.dao.ICity;
import it.objectmethod.world.model.City;


@Controller
public class CityImpl implements ICity {
	
	@Autowired
	DataSource source;

	@Override
	public City cityInfo(String name) {
		City cityInfo=null;
		try {
			Connection dbConnection=source.getConnection();
			PreparedStatement statement= dbConnection.prepareStatement("SELECT * FROM city c WHERE c.Name=?");
			statement.setString(1, name);
			ResultSet rSet= statement.executeQuery();
			while (rSet.next()) {
				cityInfo = new City();
				cityInfo.setIdCity(rSet.getInt("ID"));
				cityInfo.setCityName(rSet.getString("Name"));
				cityInfo.setCountryCode(rSet.getString("CountryCode"));
				cityInfo.setCityDistrict(rSet.getString("District"));
				cityInfo.setCityPopulation(rSet.getInt("Population"));	
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cityInfo;
	}

	@Override
	public List<City> printCityByCountry(String countryCode) {
		City city = null;
		List<City> cityList = new ArrayList<City>();
		try {
			Connection conn = source.getConnection();
			String sql = "Select c.Name ,c.Population FROM city c WHERE c.CountryCode=? ";
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, countryCode);
			ResultSet resultSet = st.executeQuery();

			while (resultSet.next()) {
				city = new City();
				city.setCityName(resultSet.getString("Name"));
				city.setCityPopulation(resultSet.getInt("Population"));
				cityList.add(city);
			}
			resultSet.close();
			st.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cityList;
	}

}
