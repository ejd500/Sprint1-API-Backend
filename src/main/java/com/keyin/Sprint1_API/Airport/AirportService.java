package com.keyin.Sprint1_API.Airport;

import com.keyin.Sprint1_API.City.City;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AirportService {

    private List<Airport> airportList = new ArrayList<>();
    private List<City> cities = new ArrayList<>();

    public Airport getAirport(Integer index){
        if (index >= 0 && index < airportList.size()) {
            return airportList.get(index);
        } else {
            return null; // index not found
        }
    }

    public Airport getAirportByAirportId(Integer airport_id){
        if (airport_id >= 1 && airport_id <= airportList.size()) {
            return airportList.get(airport_id - 1);
        } else {
            return null; // airport_id not found
        }
    }

    public Airport createAirport(Airport newAirport) {
        City existingCity = findCityByName(newAirport.getCity().getName());

        if (existingCity == null) {
            cities.add(newAirport.getCity());
        } else {
            newAirport.setCity(existingCity);
        }
        airportList.add(newAirport);
        return newAirport;
    }

    public City findCityByName(String cityName) {
        for (City city : cities) {
            if (city.getName().equalsIgnoreCase(cityName)) {
                return city;
            }
        }
        return null; // city not found
    }

    public List<Airport> getAirportsByCityName(String cityName) {
        List<Airport> airportsInCity = new ArrayList<>();
        for (Airport airport : airportList) {
            if (airport.getCity().getName().equalsIgnoreCase(cityName)) {
                airportsInCity.add(airport);
            }
        }
        return airportsInCity;
    }

    public List<Airport> getAllAirports() {
        return airportList;
    }

    public Airport updateAirport(Integer index, Airport updatedAirport){
        Airport airportToUpdate = airportList.get(index);
        airportToUpdate.setName(updatedAirport.getName());
        airportToUpdate.setCode(updatedAirport.getCode());
        City existingCity = findCityByName(updatedAirport.getCity().getName());
        if (existingCity == null) {
            cities.add(updatedAirport.getCity());
        } else {
            updatedAirport.setCity(existingCity);
        }
        airportToUpdate.setCity(updatedAirport.getCity());
        return airportToUpdate;
    }

    public Airport deleteAirport(Integer index){
        Airport airportToRemove = airportList.get(index);
        airportList.remove(airportToRemove);
        return airportToRemove;
    }
}
