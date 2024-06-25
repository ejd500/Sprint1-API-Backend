package com.keyin.Sprint1_API.Airport;

import com.keyin.Sprint1_API.City.City;
import com.keyin.Sprint1_API.City.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class AirportService {

    private int nextId = 1;

    @Autowired
    private CityService cityService;

    private List<Airport> airportList = new ArrayList<>();

    public Airport getAirport(Integer index){
        if (index >= 0 && index < airportList.size()) {
            return airportList.get(index);
        } else {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds.");
        }
    }

    public Airport getAirportByAirportId(Integer airport_id){
        if (airport_id >= 1 && airport_id <= airportList.size()) {
            return airportList.get(airport_id - 1);
        } else {
            throw new NoSuchElementException("Airport ID " + airport_id + " was not found.");
        }
    }

    public Airport createAirport(Airport newAirport) {
        for (Airport airport: airportList){
            if (airport.getCode().equalsIgnoreCase(newAirport.getCode())){
                return airport;
            }
        }
        City city = cityService.createCity(newAirport.getCity());
        Airport airportToCreate = new Airport(nextId++, newAirport.getName(), newAirport.getCode(),city);
        airportList.add(airportToCreate);
        return airportToCreate;
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
        City city = cityService.createCity(updatedAirport.getCity());
        airportToUpdate.setCity(city);
        return airportToUpdate;
    }

    public Airport updateAirportByAirportId(Integer airport_id, Airport updatedAirport){
        Airport airportToUpdate = airportList.get(airport_id - 1);
        airportToUpdate.setName(updatedAirport.getName());
        airportToUpdate.setCode(updatedAirport.getCode());
        City city = cityService.createCity(updatedAirport.getCity());
        airportToUpdate.setCity(city);
        return airportToUpdate;
    }

    public Airport deleteAirport(Integer index) {
        if (index >= 0 && index < airportList.size()) {
            Airport airportToRemove = airportList.get(index);
            airportList.remove(airportToRemove);
            return airportToRemove;
        } else {
            throw new NoSuchElementException("Index " + index + " is out of bounds.");
        }
    }

    public Airport deleteAirportByAirportId(Integer airport_id) {
        if (airport_id >= 1 && airport_id <= airportList.size()) {
            Airport airportToRemove = airportList.get(airport_id - 1);
            airportList.remove(airportToRemove);
            return airportToRemove;
        } else {
            throw new NoSuchElementException("Airport ID " + airport_id + " was not found.");
        }
    }

    public Airport getAirportByCode(String code) {
        for (Airport airport : airportList) {
            if (airport.getCode().equalsIgnoreCase(code)) {
                return airport;
            }
        }
       return null;
    }
}
