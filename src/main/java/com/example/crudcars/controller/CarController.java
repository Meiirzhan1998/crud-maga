package com.example.crudcars.controller;

import com.example.crudcars.model.Car;
import com.example.crudcars.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cars")
public class CarController {


    @Autowired
    ICarService iCarService;

    @PostMapping("/add")
    public void addCar(@RequestBody Car car){
        iCarService.addCar(car);
    }

    @GetMapping("/{id}")
    public Car findById(long id){
        return iCarService.findById(id);
    }

}
