package com.keyin.Sprint1_API.Airport;

import com.keyin.Sprint1_API.Aircraft.Aircraft;
import com.keyin.Sprint1_API.City.City;

import java.util.ArrayList;
import java.util.List;

public class Airport {

    private int airport_id;
    private String name;
    private String code;
    private City city;
    private List<Aircraft> aircrafts;

    public Airport(int airport_id, String name, String code, City city){
        this.airport_id = airport_id;
        this.name = name;
        this.code = code;
        this.city = city;
        this.aircrafts = new ArrayList<Aircraft>();
    }

    public int getAirport_id() {
        return airport_id;
    }

    public void setAirport_id(int airport_id) {
        this.airport_id = airport_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Aircraft> getAircrafts() {
        return aircrafts;
    }

    public void setAircrafts(List<Aircraft> aircrafts) {
        this.aircrafts = aircrafts;
    }
}
