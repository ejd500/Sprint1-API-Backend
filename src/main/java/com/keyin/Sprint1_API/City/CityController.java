package com.keyin.Sprint1_API.City;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin
public class CityController {
    @Autowired
    private CityService cityService;

    @PostMapping("city")
    public City createCity(@RequestBody City newCity) {
        return cityService.createCity(newCity);
    }

    @GetMapping("cities")
    public List<City> getAllCities() {
        return cityService.getAllCities();
    }

    @GetMapping("city/{index}")
    public City getCityByIndex(@PathVariable Integer index) {
        return CityService.getCityByIndex(index);
    }

    @PutMapping("city/{index}")
    public City updateCityByIndex(@PathVariable Integer index, @RequestBody City updatedCity) {
        return cityService.updateCityByIndex(index, updatedCity);
    }

    @DeleteMapping("city/{index}")
    public void deleteCity(@PathVariable Integer index) {
        cityService.deleteCity(index);
    }
}
