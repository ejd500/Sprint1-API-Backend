package com.keyin.Sprint1_API.City;

import java.util.List;

public class City {
    private int city_id;
    private String name;
    private String province;
    private int population;

    public City(String name, String province, int population, int city_id) {
        this.name = name;
        this.province = province;
        this.population = population;
        this.city_id  = city_id;
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
