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
    public void deleteCityByIndex(@PathVariable Integer index) {
        cityService.deleteCityByIndex(index);
    }

    @GetMapping("city/id/{city_id}")
    public City getCityById(@PathVariable Integer city_id){
        return cityService.getCityById(city_id);
    }

    @PutMapping("city/id/{city_id}")
    public City updateCityById(@PathVariable Integer city_id, @RequestBody City updatedCity){
        return cityService.updateCityById(city_id, updatedCity);
    }

    @DeleteMapping("city/id/{city_id}")
    public void deleteCityById(@PathVariable Integer city_id){
        cityService.deleteCityById(city_id);
    }
}
