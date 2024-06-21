package com.keyin.Sprint1_API.Passenger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class PassengerController {
    @Autowired
    private PassengerService passengerService;

    @PostMapping("create_passenger")
    public Passenger createPassenger(@RequestBody Passenger newPassenger) {
        return passengerService.createPassenger(newPassenger);
    }

    @GetMapping("passengers")
    public List<Passenger> getAllPassengers() {
        return passengerService.getAllPassengers();
    }

}