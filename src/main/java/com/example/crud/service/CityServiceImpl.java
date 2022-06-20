package com.example.crud.service;

import com.example.crud.model.City;
import com.example.crud.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityServiceImpl implements ICityService {

    @Autowired
    protected CityRepository cityRepository;

    public void create(City city) {
        cityRepository.save(city);
    }

    public City read(long id) {
        Optional<City> city = cityRepository.findById(id);
        if(!city.isPresent()){
            throw new RuntimeException(String.format("Car not found with id = %s", id));
        }
        return city.get();
    }

    public City update(City city) {
        return cityRepository.save(city);
    }

    public void delete(long id) {
       cityRepository.deleteById(id);
    }


    public List<City> findAllByCountry_Id(long countryId){
        return cityRepository.findAllByCountry_Id(countryId);
    }
}
