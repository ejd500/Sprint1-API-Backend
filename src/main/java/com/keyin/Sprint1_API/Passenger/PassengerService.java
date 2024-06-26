package com.keyin.Sprint1_API.Passenger;

import com.keyin.Sprint1_API.Aircraft.Aircraft;
import com.keyin.Sprint1_API.Aircraft.AircraftService;
import com.keyin.Sprint1_API.Airport.Airport;
import com.keyin.Sprint1_API.City.City;
import com.keyin.Sprint1_API.City.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PassengerService {

    private int nextId = 1;

    private List<Passenger> passengers = new ArrayList<>();

    @Autowired
    private CityService cityService;
    @Autowired
    @Lazy
    private AircraftService aircraftService;

    public Passenger createPassenger(Passenger newPassenger){
        for(Passenger passenger: passengers) {
            if (passenger.getFirstName().equalsIgnoreCase(newPassenger.getFirstName()) &&
                    passenger.getLastName().equalsIgnoreCase(newPassenger.getLastName()) &&
                    passenger.getPhoneNum().equalsIgnoreCase(newPassenger.getPhoneNum()) &&
                    passenger.getCity().getName().equalsIgnoreCase(newPassenger.getCity().getName()) &&
                    passenger.getCity().getProvince().equalsIgnoreCase(newPassenger.getCity().getProvince()) &&
                    passenger.getCity().getPopulation() == newPassenger.getCity().getPopulation()
            ) {
                return passenger;
            }
        }
        City city = cityService.createCity(newPassenger.getCity());
        Passenger passengerToCreate = new Passenger(nextId++, newPassenger.getFirstName(), newPassenger.getLastName(), newPassenger.getPhoneNum(), city);
        passengers.add(passengerToCreate);
        return passengerToCreate;
    }

    public List<Passenger> getAllPassengers(){
        return passengers;
    }

    public Passenger getPassengerByIndex(int index) {
        if(index >= passengers.size()){
            throw new IndexOutOfBoundsException();
        } else {
            return passengers.get(index);
        }
    }

    public Passenger getPassengerByPassengerId(Integer passengerId) {
        for(Passenger passenger : passengers){
            if (passenger.getPassenger_id() == passengerId){
                return passenger;
            }
        }
        return null;
    }

    public Passenger updatePassengerByPassengerId(Integer passengerId, Passenger updatedPassenger) {
        for(Passenger passenger: passengers){
            if(passenger.getPassenger_id() == passengerId){
                passenger.setFirstName(updatedPassenger.getFirstName());
                passenger.setLastName(updatedPassenger.getLastName());
                passenger.setPhoneNum(updatedPassenger.getPhoneNum());
                if(passenger.getCity().getName().equalsIgnoreCase(updatedPassenger.getCity().getName()) &&
                    passenger.getCity().getProvince().equalsIgnoreCase(updatedPassenger.getCity().getProvince()) &&
                        passenger.getCity().getPopulation()==updatedPassenger.getCity().getPopulation()
                ){
//                    SKIP
                } else {
                    City city = cityService.createCity(updatedPassenger.getCity());
                    passenger.setCity(city);
                }
                return passenger;
            }
        }
        return null;
    }

    public void deletePassengerByPassengerId(int passenger_id){
        for (Passenger passenger : passengers){
            if (passenger.getPassenger_id() == passenger_id){
                passengers.remove(passenger);
                removePassengerFromAircraftPassengerList(passenger_id);
                return;
            }
        }
    }

    private void removePassengerFromAircraftPassengerList(int passengerId) {
        List<Aircraft> allAircraft = aircraftService.getAllAircraft();
        for(Aircraft aircraft:allAircraft){
            for(Passenger passenger: aircraft.getPassengers()){
                if(passenger.getPassenger_id() == passengerId){
                    aircraft.getPassengers().remove(passenger);
                    return;
                }
            }
        }
    }

    // Get a list of aircrafts that a passenger has travelled on.
    public List<Aircraft> getAllAircraftAPassengerHasTravelledOn(Integer passengerId) {
        List<Aircraft> listOfAircraftsAPassengerHasTravelledOn = new ArrayList<>();
        List<Aircraft> allAircraft = aircraftService.getAllAircraft();
        for(Aircraft aircraft : allAircraft){
            List<Passenger> passengersInAircraft = aircraft.getPassengers();
            for(Passenger passenger : passengersInAircraft){
                if(passenger.getPassenger_id() == passengerId){
                    listOfAircraftsAPassengerHasTravelledOn.add(aircraft);
                }
            }
        }
        return listOfAircraftsAPassengerHasTravelledOn;
    }

    // What airports have passengers used?
    public List<Airport> getAllAirportsAPassengerHasUsed(Integer passengerId) {
        List<Airport> listOfAirportsAPassengerHasUsed = new ArrayList<>();
        List<Aircraft> allAircraft = aircraftService.getAllAircraft();
        for(Aircraft aircraft : allAircraft){
            List<Passenger> passengersInAircraft = aircraft.getPassengers();
            for(Passenger passenger : passengersInAircraft){
                if(passenger.getPassenger_id() == passengerId){
                    List<Airport> airportsAPassengerUsed = aircraft.getAirports();
                    listOfAirportsAPassengerHasUsed.addAll(airportsAPassengerUsed);

                }
            }
        }
        return listOfAirportsAPassengerHasUsed;
    }





}
