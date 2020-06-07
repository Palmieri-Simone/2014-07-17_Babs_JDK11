package it.polito.tdp.babs.model;

import java.util.Date;

public class Station {

	private int stationId ;//station ID number
	private String name ; //name of station
	private double lat ; //latitude
	private double lng ; //longitude
	private int dockCount ; //number of total docks at station
	private String landmark ; //city (San Francisco, Redwood City, Palo Alto, Mountain View, San Jose)
	private Date installation ; //date that station was installed
	
	public Station(int stationId, String name, double lat, double lng,
			int dockCount, String landmark, Date installation) {
		super();
		this.stationId = stationId;
		this.name = name;
		this.lat = lat;
		this.lng = lng;
		this.dockCount = dockCount;
		this.landmark = landmark;
		this.installation = installation;
	}

	public int getStationId() {
		return stationId;
	}

	public void setStationId(int stationId) {
		this.stationId = stationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}

	public int getDockCount() {
		return dockCount;
	}

	public void setDockCount(int dockCount) {
		this.dockCount = dockCount;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public Date getInstallation() {
		return installation;
	}

	public void setInstallation(Date installation) {
		this.installation = installation;
	}
	
	
	
	
}

