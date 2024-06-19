package com.keyin.Sprint1_API.Aircraft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class EllensAircraftController {

    @Autowired
    private EllensAircraftService aircraftService;

    @GetMapping("aircrafts")
    public List<EllensAircraft> getAllAircrafts() {
        return aircraftService.getAllAircrafts();
    }

}
