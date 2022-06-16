package com.example.crudcars.service;

import com.example.crudcars.model.Car;
import com.example.crudcars.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements ICarService {

    @Autowired
    protected CarRepository carRepository;

    @Override
    @Transactional
    public Car findById(long id) {
        Optional<Car> car = carRepository.findById(id);
        if(!car.isPresent()){
            throw new RuntimeException(String.format("Car not found with id = %s", id));
        }
        return car.get();
    }

    @Override
    public void addCar(Car car) {
        carRepository.save(car);
    }

    public List<Car> findAllByCountry_Id(long countryId){
        return carRepository.findAllByCountry_Id(countryId);
    }
}
