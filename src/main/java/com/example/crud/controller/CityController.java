package com.example.crud.controller;

import com.example.crud.model.City;
import com.example.crud.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class CityController {

    @Autowired
    ICityService iCityService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public void addCity(@RequestBody City city){
        iCityService.addCity(city);
    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public City findById(@RequestParam(name = "id") long id){
        return iCityService.findById(id);
    }

    @RequestMapping(value = "/findByCountryId/{countryId}",method = RequestMethod.GET)
    public List<City> findAllByCountry_Id(@PathVariable long countryId){
        return iCityService.findAllByCountry_Id(countryId);
    }

}
