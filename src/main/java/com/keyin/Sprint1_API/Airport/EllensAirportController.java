package com.keyin.Sprint1_API.Airport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class EllensAirportController {
    @Autowired
    private EllensAirportService airportService;

    @GetMapping("airports")
    public List<EllensAirport> getAllAirports() {
        return airportService.getAllAirports();
    }

    @PostMapping("create_airport")
    public EllensAirport createCity(@RequestBody EllensAirport newAirport) {
        return airportService.createAirport(newAirport);
    }
}
