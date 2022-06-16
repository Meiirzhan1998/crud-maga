package com.example.crudcars.controller;

import com.example.crudcars.model.Car;
import com.example.crudcars.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {


    @Autowired
    ICarService iCarService;

    @PostMapping("/add")
    public void addCar(@RequestBody Car car){
        iCarService.addCar(car);
    }

    @GetMapping("/findById")
    public Car findById(@RequestParam(name = "id") long id){
        return iCarService.findById(id);
    }

    @GetMapping("/finByCountryId/{countryId}")
    public List<Car> findAllByCountry_Id(@PathVariable long countryId){
        List<Car> cars = iCarService.findAllByCountry_Id(countryId);
        return cars;
    }

}
