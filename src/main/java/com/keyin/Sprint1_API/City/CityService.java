package com.keyin.Sprint1_API.City;

import com.keyin.Sprint1_API.Passenger.Passenger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityService {

    private int nextId = 1;

    private static List<City> cities = new ArrayList<>();

    public City createCity(City newCity){
        for(City city: cities){
            if (city.getName().equalsIgnoreCase(newCity.getName()) &&
                    city.getProvince().equalsIgnoreCase(newCity.getProvince()) &&
                    city.getPopulation() == newCity.getPopulation()
            ){
                return city;
            }
        }
        City cityToCreate = new City(newCity.getName(), newCity.getProvince(), newCity.getPopulation(), nextId++);
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

    public void deleteCityByIndex(int index) {
        cities.remove(index);
    }

    public City getCityById(Integer cityId) {
        for(City city : cities){
            if (city.getCity_id() == cityId){
                return city;
            }
        }
        System.out.println("No such ID available.");
        return null;
    }

    public City updateCityById(Integer cityId, City updatedCity) {
        for(City city: cities){
            if(city.getCity_id() == cityId){
                city.setName(updatedCity.getName());
                city.setProvince(updatedCity.getProvince());
                city.setPopulation(updatedCity.getPopulation());
                return city;
            }
        }
        System.out.println("No such ID available to update.");
        return null;
    }

    public void deleteCityById(Integer cityId) {
        for(City city:cities){
            if(city.getCity_id() == cityId){
                cities.remove(city);
                return;
            }
        }
    }
}
