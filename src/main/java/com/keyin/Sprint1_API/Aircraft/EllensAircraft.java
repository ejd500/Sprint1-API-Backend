package com.keyin.Sprint1_API.Aircraft;

import com.keyin.Sprint1_API.Airport.EllensAirport;
import com.keyin.Sprint1_API.Passenger.Passenger;

import java.util.ArrayList;
import java.util.List;

public class EllensAircraft {

    private static int id_increment = 1;

    private int aircraft_id;
    private String aircraftType;
    private String airlineName;
    private int numPassengers;
    private List<Passenger> passengers;
    private List<EllensAirport> airports;

    public EllensAircraft(String aircraftType, String airlineName, int numPassengers){
        this.aircraft_id = id_increment++;
        this.aircraftType = aircraftType;
        this.airlineName = airlineName;
        this.numPassengers = numPassengers;
        this.passengers = new ArrayList<Passenger>();
        this.airports = new ArrayList<EllensAirport>();
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

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public List<EllensAirport> getAirports() {
        return airports;
    }

    public void setAirports(List<EllensAirport> airports) {
        this.airports = airports;
    }
}
