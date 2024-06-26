package com.keyin.Sprint1_API.Passenger;

import com.keyin.Sprint1_API.Aircraft.Aircraft;
import com.keyin.Sprint1_API.Aircraft.AircraftService;
import com.keyin.Sprint1_API.Airport.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class PassengerController {
    @Autowired
    private PassengerService passengerService;

    @PostMapping("passenger")
    public Passenger createPassenger(@RequestBody Passenger newPassenger) {
        return passengerService.createPassenger(newPassenger);
    }

    @GetMapping("passengers")
    public List<Passenger> getAllPassengers() {
        return passengerService.getAllPassengers();
    }

    @GetMapping("passenger/{index}")
    public Passenger getPassengerByIndex(@PathVariable Integer index){
        return passengerService.getPassengerByIndex(index);
    }

    @GetMapping("passenger/id/{passenger_id}")
    public Passenger getPassengerByPassengerId(@PathVariable Integer passenger_id){
        return passengerService.getPassengerByPassengerId(passenger_id);
    }

    @PutMapping("passenger/id/{passenger_id}")
    public Passenger updatePassengerByPassengerId(@PathVariable Integer passenger_id, @RequestBody Passenger updatedPassenger){
        return passengerService.updatePassengerByPassengerId(passenger_id, updatedPassenger);
    }

    @DeleteMapping("passenger/id/{passenger_id}")
    public void deletePassengerByPassengerId(@PathVariable Integer passenger_id){
        passengerService.deletePassengerByPassengerId(passenger_id);
    }

//  List all aircraft passengers have travelled on
    @GetMapping("passenger/id/{passengerId}/aircraft")
    public List<Aircraft> getAllAircraftAPassengerHasTravelledOn(@PathVariable Integer passengerId){
        return passengerService.getAllAircraftAPassengerHasTravelledOn(passengerId);
    }

//  What airports have passengers used?
    @GetMapping("passenger/id/{passengerId}/airports")
    public List<Airport> getAllAirportsAPassengerHasUsed(@PathVariable Integer passengerId){
        return passengerService.getAllAirportsAPassengerHasUsed(passengerId);
    }
}
