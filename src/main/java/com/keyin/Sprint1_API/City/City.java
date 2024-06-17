package com.keyin.Sprint1_API.City;

import com.keyin.Sprint1_API.Airport.Airport;

import java.util.ArrayList;
import java.util.List;

public class City {

    private int city_id;
    private String name;
    private String state;
    private int population;
    private List<Airport> airports = new ArrayList<Airport>();
}
