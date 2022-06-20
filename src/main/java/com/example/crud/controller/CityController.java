package com.example.crud.controller;

import com.example.crud.model.City;
import com.example.crud.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/city")
public class CityController {

    @Autowired
    ICityService iCityService;

    @PostMapping("/create")
    public void create(@RequestBody City city) {
        iCityService.create(city);
    }

    @GetMapping("read/{id}")
    public City read(@PathVariable long id) {
        return iCityService.read(id);
    }

    @PutMapping("/update")
    public City update(@RequestBody City city) {
        return iCityService.update(city);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id) {
        iCityService.delete(id);
    }

    @GetMapping("/countryId/{countryId}")
    public List<City> findAllByCountry_Id(@PathVariable long countryId) {
        return iCityService.findAllByCountry_Id(countryId);
    }
}
