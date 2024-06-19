package com.keyin.Sprint1_API.Airport;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EllensAirportService {
    private List<EllensAirport> airports = new ArrayList<>();

    public EllensAirport getAirport(int index){
        return airports.get(index);
    }

    public List<EllensAirport> getAllAirports(){
        return airports;
    }

    public EllensAirport createAirport(EllensAirport newAirport){
//        if(newAirport.getAircraftList() == null){
//            ArrayList<Aircraft> aircraftArrayList = new ArrayList<>();
//            newAirport.setAircraftList(aircraftArrayList);
//        }
//        if (newAirport.getCity() != null){
//            if (newAirport.getCity().getAirports() == null){
//                ArrayList<Airport> airports = new ArrayList<>();
//                airports.add(newAirport);
//                newAirport.getCity().setAirports(airports);
//            } else {
//                newAirport.getCity().getAirports().add(newAirport);
//            }
//        }

        airports.add(newAirport);

        return newAirport;
    }
}
