package it.polito.tdp.babs.db;

import it.polito.tdp.babs.model.Station;
import it.polito.tdp.babs.model.Trip;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 * Classe DAO per l'accesso al database {@code babs} (Bay Area Bike Sharing)
 * 
 * @author Fulvio
 * 
 */
public class BikeDAO {

	/**
	 * Interroga il database e restituisce tutti i dati nella tabella
	 * {@code station} sotto forma di un {@link ArrayList} di
	 * {@link Station}.
	 * 
	 * @return la {@link ArrayList} di {@link Station}
	 */
	public List<Station> getAllStations() {

		final String sql = "SELECT * FROM station";

		List<Station> stations = new ArrayList<Station>();

		try {
			Connection conn = DBConnect.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);

			ResultSet rs = st.executeQuery();

			while (rs.next()) {

				Station s = new Station(
						rs.getInt("station_id"),
						rs.getString("name"),
						rs.getDouble("lat"),
						rs.getDouble("long"),
						rs.getInt("dockcount"),
						rs.getString("landmark"),
						rs.getDate("installation")
						);
				stations.add(s);
			}
			return stations;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * Interroga il database e restituisce tutti i dati nella tabella
	 * {@code station} sotto forma di un {@link ArrayList} di
	 * {@link Station}.
	 * 
	 * @return la {@link ArrayList} di {@link Station}
	 */
	public List<Trip> getAllTrips() {

		final String sql = "SELECT * FROM trip";

		List<Trip> trips = new ArrayList<Trip>();

		try {
			Connection conn = DBConnect.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);

			ResultSet rs = st.executeQuery();

			while (rs.next()) {

				Trip t = new Trip(
						rs.getInt("TripID"),
						rs.getInt("Duration"),
						rs.getTimestamp("StartDate"),
						rs.getString("StartStation"),
						rs.getInt("StartTerminal"),
						rs.getTimestamp("EndDate"),
						rs.getString("EndStation"),
						rs.getInt("EndTerminal"),
						rs.getInt("BikeNum"),
						rs.getString("SubscriptionType"),
						rs.getInt("Zip Code")
						);
				trips.add(t);
			}
			return trips;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}


	

}