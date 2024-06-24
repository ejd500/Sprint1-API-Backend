package com.keyin.Sprint1_API.City;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityService {

    private int nextId = 1;

    private static List<City> cities = new ArrayList<>();

    public City createCity(City newCity){
        for(City city: cities){
            if (city.getName().equalsIgnoreCase(newCity.getName())){
                return city;
            }
        }
        City cityToCreate = new City(newCity.getName(), newCity.getProvince(), newCity.getPopulation(),nextId++);
        cities.add(cityToCreate);
        return cityToCreate;
    }

    public List<City> getAllCities(){
        return cities;
    }

    public static City getCityByIndex(int index){
        return cities.get(index);
    }

    public City updateCityByIndex(int index, City updatedCity) {
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
