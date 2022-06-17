package com.example.crud.controller;

import com.example.crud.model.Country;
import com.example.crud.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
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
