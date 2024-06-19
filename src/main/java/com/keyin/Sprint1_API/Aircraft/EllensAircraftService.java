package com.keyin.Sprint1_API.Aircraft;

import com.keyin.Sprint1_API.Passenger.Passenger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EllensAircraftService {
    private List<EllensAircraft> aircrafts = new ArrayList<>();

    public List<EllensAircraft> getAllAircrafts(){
        return aircrafts;
    }

    public List<EllensAircraft> getAllAircraftsUsedBySpecificPassenger(Passenger passenger){
        List<EllensAircraft> aircraftArrayList = new ArrayList<>();
        for(EllensAircraft aircraft: aircrafts ){
            List<Passenger> aircraftPassengerList = aircraft.getPassengers();
            for(Passenger p : aircraftPassengerList){
                if (p.equals(passenger)){
                    aircraftArrayList.add(aircraft);
                }
            }
        }
        return aircraftArrayList;
    }
}
