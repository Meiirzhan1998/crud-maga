package com.example.crudcars.service;

import com.example.crudcars.model.Car;

import java.util.List;

public interface ICarService {
    Car findById(long id);

    void addCar(Car car);

   List<Car> findAllByCountry_Id(long countryId);
}
