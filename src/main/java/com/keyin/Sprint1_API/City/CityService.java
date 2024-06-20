package com.keyin.Sprint1_API.City;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityService {
    private static List<City> cities = new ArrayList<>();

    public City createCity(City newCity){
        cities.add(newCity);
        return newCity;
    }

    public List<City> getAllCities(){
        return cities;
    }

    public static City getCity(int index){
        return cities.get(index);
    }

    public City updateCity(int index, City updatedCity) {
        City cityToUpdate = cities.get(index);

        cityToUpdate.setName(updatedCity.getName());
        cityToUpdate.setProvince(updatedCity.getProvince());
        cityToUpdate.setPopulation(updatedCity.getPopulation());

        return cityToUpdate;
    }

    public void deleteCity(int index) {
        cities.remove(index);
    }

}
