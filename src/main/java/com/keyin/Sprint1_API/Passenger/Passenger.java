package com.keyin.Sprint1_API.Passenger;

import com.keyin.Sprint1_API.Aircraft.Aircraft;
import com.keyin.Sprint1_API.City.City;

import java.util.ArrayList;
import java.util.List;

public class Passenger {

    private int passenger_id;
    private String firstName;
    private String lastName;
    private String phoneNum;
    private City city;
    private List<Aircraft> aircrafts = new ArrayList<Aircraft>();

}
