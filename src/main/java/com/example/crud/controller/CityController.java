package com.example.crud.controller;

import com.example.crud.model.City;
import com.example.crud.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController {


    @Autowired
    ICityService iCityService;

    @PostMapping("/add")
    public void addCity(@RequestBody City city){
        iCityService.addCity(city);
    }

    @GetMapping("/findById")
    public City findById(@RequestParam(name = "id") long id){
        return iCityService.findById(id);
    }

    @GetMapping("/findByCountryId/{countryId}")
    public List<City> findAllByCountry_Id(@PathVariable long countryId){
        return iCityService.findAllByCountry_Id(countryId);
    }

}
