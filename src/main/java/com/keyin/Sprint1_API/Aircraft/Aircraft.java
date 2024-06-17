package com.keyin.Sprint1_API.Aircraft;

import com.keyin.Sprint1_API.Airport.Airport;
import com.keyin.Sprint1_API.Passenger.Passenger;

import java.util.ArrayList;
import java.util.List;

public class Aircraft {

    private int aircraft_id;
    private String airlineType;
    private String airlineName;
    private int numPassengers;
    private List<Passenger> passengers = new ArrayList<Passenger>();
    private List<Airport> airports = new ArrayList<Airport>();
}
