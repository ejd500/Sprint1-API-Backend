package com.keyin.Sprint1_API.Passenger;

import com.keyin.Sprint1_API.City.City;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PassengerService {
    private List<Passenger> passengers = new ArrayList<>();

    public Passenger createPassenger(Passenger newPassenger){
        passengers.add(newPassenger);
        return newPassenger;
    }

    public List<Passenger> getAllPassengers(){
        return passengers;
    }

}
