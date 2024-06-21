package com.keyin.Sprint1_API.Passenger;

import com.keyin.Sprint1_API.City.City;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PassengerService {
    private List<Passenger> passengers = new ArrayList<>();

    public Passenger createPassenger(Passenger newPassenger){
        if(passengers.isEmpty()){
            passengers.add(newPassenger);
            return newPassenger;
        } else {
            for(Passenger passenger: passengers){
                if(passenger.getFirstName().equalsIgnoreCase(newPassenger.getFirstName()) &&
                        passenger.getLastName().equalsIgnoreCase(newPassenger.getLastName()) &&
                        passenger.getPhoneNum().equalsIgnoreCase(newPassenger.getPhoneNum()) &&
                        passenger.getCity().equals(newPassenger.getCity())
                ){
                    newPassenger = null;
                    return newPassenger;
                }
            }
            passengers.add(newPassenger);
            return newPassenger;
        }
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
