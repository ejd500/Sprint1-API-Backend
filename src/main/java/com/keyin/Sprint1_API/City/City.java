package com.keyin.Sprint1_API.City;

import java.util.List;

public class City {
    private static int nextId = 1; // Static field to keep track of the next ID to be assigned

    private int city_id;
    private String name;
    private String province;
    private int population;

    public City(String name, String province, int population) {
        this.name = name;
        this.province = province;
        this.population = population;
        CityService cityService = new CityService();
        List<City> cities = cityService.getAllCities();
        if (cities.isEmpty()){
            this.city_id = nextId;
        } else {
            for (City city : cities){
                if (city.getName().equals(this.name) && city.getProvince().equals(this.province) && city.getPopulation() == this.population){
                    this.city_id = city.getCity_id();
                } else {
                    this.city_id = nextId++;
                }
            }
        }
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

}
