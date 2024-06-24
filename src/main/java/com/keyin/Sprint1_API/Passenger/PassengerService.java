package com.keyin.Sprint1_API.Passenger;

import com.keyin.Sprint1_API.City.City;
import com.keyin.Sprint1_API.City.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PassengerService {

    private int nextId = 1;

    private List<Passenger> passengers = new ArrayList<>();

    @Autowired
    private CityService cityService;

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

    public boolean passengerIsFoundInPassengers(Passenger passenger) {
        return passengers.contains(passenger);
    }

    public void deletePassengerByIndex(int index) {
        passengers.remove(index);
    }
    public void deletePassengerByPassenger(Passenger passenger){
        passengers.remove(passenger);
    }
}
