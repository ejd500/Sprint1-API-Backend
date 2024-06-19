package com.keyin.Sprint1_API.City;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class CityController {
    @Autowired
    private CityService cityService;

    @PostMapping("create_city")
    public City createCity(@RequestBody City newCity) {
        return cityService.createCity(newCity);
    }

    @GetMapping("cities")
    public List<City> getAllCities() {
        return cityService.getAllCities();
    }

    @GetMapping("city/{index}")
    public City getCity(@PathVariable Integer index) {
        return CityService.getCity(index);
    }

    @PutMapping("city/{index}")
    public City updateCity(@PathVariable Integer index, @RequestBody City updatedCity) {
        return cityService.updateCity(index, updatedCity);
    }

    @DeleteMapping("greeting/{index}")
    public void deleteGreeting(@PathVariable Integer index) {
        cityService.deleteCity(index);
    }

}
