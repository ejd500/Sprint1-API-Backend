package com.keyin.Sprint1_API.Aircraft;

import com.keyin.Sprint1_API.Airport.Airport;
import com.keyin.Sprint1_API.Passenger.Passenger;

// DO YOU SEE THIS CORINA???

import java.util.ArrayList;
import java.util.List;

public class Aircraft {

    private int aircraft_id;
    private String airlineType;
    private String airlineName;
    private int numPassengers;
    private List<Passenger> passengers;
    private List<Airport> airports;

    public Aircraft(int aircraft_id, String airlineType, String airlineName, int numPassengers){
        this.aircraft_id = aircraft_id;
        this.airlineType = airlineType;
        this.airlineName = airlineName;
        this.numPassengers = numPassengers;
        this.passengers = new ArrayList<Passenger>();
        this.airports = new ArrayList<Airport>();
    }

    public int getAircraft_id() {
        return aircraft_id;
    }

    public void setAircraft_id(int aircraft_id) {
        this.aircraft_id = aircraft_id;
    }

    public String getAirlineType() {
        return airlineType;
    }

    public void setAirlineType(String airlineType) {
        this.airlineType = airlineType;
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

    public List<Airport> getAirports() {
        return airports;
    }

    public void setAirports(List<Airport> airports) {
        this.airports = airports;
    }
}
