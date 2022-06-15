package com.example.crudcars.service;

import com.example.crudcars.model.Car;

public interface ICarService {
    Car findById(long id);

    void addCar(Car car);
}
