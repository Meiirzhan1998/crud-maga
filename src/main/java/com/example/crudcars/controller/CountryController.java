package com.example.crudcars.controller;

import com.example.crudcars.model.Country;
import com.example.crudcars.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    protected ICountryService iCountryService;

    @PostMapping("/add")
    public void addCountry(@RequestBody Country country){
        iCountryService.addCountry(country);
    }

    @GetMapping("/{id}")
    public Country findById(@PathVariable long id){
        return iCountryService.findById(id);
    }

}
