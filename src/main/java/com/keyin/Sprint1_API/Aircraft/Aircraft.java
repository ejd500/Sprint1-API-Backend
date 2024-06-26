package com.keyin.Sprint1_API.Aircraft;
import com.keyin.Sprint1_API.Airport.Airport;
import com.keyin.Sprint1_API.Passenger.Passenger;

import java.util.ArrayList;

import java.util.List;

public class Aircraft {

    private int aircraft_id;
    private String aircraftType;
    private String airlineName;
    private int numPassengers;
    private List<Airport> airports;
    private List<Passenger> passengers;

    public Aircraft(int aircraft_id, String aircraftType, String airlineName, int numPassengers, List<Airport> airports, List<Passenger> passengers){
        this.aircraft_id = aircraft_id;
        this.aircraftType = aircraftType;
        this.airlineName = airlineName;
        this.numPassengers = numPassengers;
        this.airports = (airports != null) ? airports: new ArrayList<>();
        this.passengers = (passengers != null)? passengers : new ArrayList<>();
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

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

}
