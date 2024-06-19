package com.keyin.Sprint1_API.Aircraft;

import com.keyin.Sprint1_API.Airport.Airport;
import java.util.List;

public class Aircraft {

    private static int id_increment = 1;

    private int aircraft_id;
    private String aircraftType;
    private String airlineName;
    private int numPassengers;
    private List<Airport> airports;

    public Aircraft(String aircraftType, String airlineName, int numPassengers, List<Airport> airports){
        this.aircraft_id = id_increment++;
        this.aircraftType = aircraftType;
        this.airlineName = airlineName;
        this.numPassengers = numPassengers;
        this.airports = airports;
    }

    public int getAircraft_id() {
        return aircraft_id;
    }

    public void setAircraft_id(int aircraft_id) {
        this.aircraft_id = aircraft_id;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }

    public List<Airport> getAirports() {
        return airports;
    }

    public void setAirports(List<Airport> airports) {
        this.airports = airports;
    }

}
