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
    private List<Aircraft> aircraft =  new ArrayList<Aircraft>();

}
