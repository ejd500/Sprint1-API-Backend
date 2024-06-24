package com.keyin.Sprint1_API.Aircraft;

import com.keyin.Sprint1_API.Airport.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class AircraftController {

    @Autowired
    private AircraftService aircraftService;

    @GetMapping("aircraft")
    public List<Aircraft> getAllAircraft(){
        return aircraftService.getAllAircraft();
    }

    @GetMapping("aircraft/{index}")
    public Aircraft getAircraft(@PathVariable Integer index){
        return aircraftService.getAircraft(index);
    }

    @GetMapping("aircraft/id/{aircraftId}")
    public Aircraft getAircraftByAircraftId(@PathVariable Integer aircraftId){
        return aircraftService.getAircraftByAircraftId(aircraftId);
    }

    @GetMapping("aircraft/{index}/airports")
    public List<Airport> getAllAirportsUsedBySpecificAircraft(@PathVariable Integer index){
        return this.aircraftService.getAllAirportsUsedBySpecificAircraft(index);
    }

    @PostMapping("aircraft")
    public Aircraft createAircraft(@RequestBody Aircraft newAircraft){
        return aircraftService.createAircraft(newAircraft);
    }

    @PutMapping("aircraft/{index}")
    public Aircraft updateAircraft(@PathVariable Integer index, @RequestBody Aircraft updatedAircraft){
        return aircraftService.updateAircraft(index, updatedAircraft);
    }

    @DeleteMapping("aircraft/{index}")
    public Aircraft deleteAircraft(@PathVariable Integer index){
        return aircraftService.deleteAircraft(index);
    }
}
