package it.objectmethod.world.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import it.objectmethod.world.dao.ICountry;
import it.objectmethod.world.model.Country;

@Component
public class CountryImpl implements ICountry {

	@Autowired
	DataSource source;


	@Override
	public List<Country> viewContinentByNameAndContinent(String nameCountry, String nameContinent) {
		Country coun = null;
		List<Country> countryList = new ArrayList<Country>();
		try {
			Connection conn = source.getConnection();
			String sql = "SELECT Code,Name,Continent,Population,SurfaceArea FROM country WHERE ((''=? OR Name=?) AND Continent=?) OR (Name=? AND(''=? OR Continent=?))";
			PreparedStatement st = conn.prepareStatement(sql);

			st.setString(1, nameCountry);
			st.setString(2, nameCountry);
			st.setString(3, nameContinent);
			st.setString(4, nameCountry);
			st.setString(5, nameContinent);
			st.setString(6, nameContinent);

			ResultSet resultSet = st.executeQuery();

			while (resultSet.next()) {
				coun = new Country();
				coun.setCodiceNazione(resultSet.getString("Code"));
				coun.setNomeNazione(resultSet.getString("Name"));
				coun.setNomeContinente(resultSet.getString("Continent"));
				coun.setPopolazione(resultSet.getInt("Population"));
				coun.setSuperfice(resultSet.getInt("SurfaceArea"));
				countryList.add(coun);
			}
			resultSet.close();
			st.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return countryList;
		
	}

	@Override
	public List<Country> printContinent() {
		Country coun = null;
		List<Country> continentList = new ArrayList<Country>();
		try {
			Connection conn = source.getConnection();
			String sql = "SELECT DISTINCT Continent FROM country";
			PreparedStatement st = conn.prepareStatement(sql);
			ResultSet resultSet = st.executeQuery();

			while (resultSet.next()) {
				coun = new Country();
				coun.setNomeContinente(resultSet.getString("Continent"));
				continentList.add(coun);
			}
			resultSet.close();
			st.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return continentList;
	}

	@Override
	public List<Country> printContinentInfo(String nomeContinente) {
		Country coun = null;
		List<Country> infoCountryList = new ArrayList<Country>();
		try {
			Connection conn = source.getConnection();
			String sql = "SELECT c.Code,c.Name ,c.Population FROM country c WHERE c.Continent =?";
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, nomeContinente);
			ResultSet resultSet = st.executeQuery();

			while (resultSet.next()) {
				coun = new Country();
				coun.setCodiceNazione(resultSet.getString("Code"));
				coun.setNomeNazione(resultSet.getString("Name"));
				coun.setPopolazione(resultSet.getInt("Population"));
				infoCountryList.add(coun);
			}
			resultSet.close();
			st.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return infoCountryList;
	}

}
