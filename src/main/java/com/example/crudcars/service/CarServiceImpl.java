package com.example.crudcars.service;

import com.example.crudcars.model.Car;
import com.example.crudcars.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements ICarService {

    @Autowired
    protected CarRepository carRepository;

    @Override
    public Car findById(long id) {
        return carRepository.findById(id);
    }

    @Override
    public void addCar(Car car) {
        carRepository.save(car);
    }
}
