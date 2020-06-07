package it.polito.tdp.babs.db;

import java.util.List;

import it.polito.tdp.babs.model.Station;
import it.polito.tdp.babs.model.Trip;

public class TestDAO {

	/**
	 * Test method for class {@link BikeDAO}
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		
		BikeDAO dao = new BikeDAO() ;
		
		List<Station> list = dao.getAllStations() ;
		
		for( Station s : list ) {
			System.out.format("%-4d %10s %f-%f %d %s\n", 
					s.getStationId(), s.getName(), s.getLat(), s.getLng(), s.getDockCount(), s.getLandmark()) ;
		}
		
		List<Trip> list2 = dao.getAllTrips() ;
		
		for( Trip t : list2 ) {
			System.out.format("%tc %s - %tc %s -> %d\n", 
					t.getStartDate(), t.getStartStation(), t.getEndDate(), t.getEndStation(), t.getDuration()) ;
		}


	}
}
