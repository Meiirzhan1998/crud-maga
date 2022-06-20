package com.example.crud.controller;

import com.example.crud.model.Country;
import com.example.crud.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/country")
public class CountryController {

    @Autowired
    protected ICountryService iCountryService;


    @PostMapping("/create")
    public void create(@RequestBody Country country) {
        iCountryService.create(country);
    }

    @GetMapping("read/{id}")
    public Country read(@PathVariable long id) {
        return iCountryService.read(id);
    }

    @PutMapping("/update")
    public Country update(@RequestBody Country country) {
        return iCountryService.update(country);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id) {
        iCountryService.delete(id);
    }


}
