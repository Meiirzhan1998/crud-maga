package com.example.crud.service;

import com.example.crud.model.City;
import com.example.crud.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class CityServiceImpl implements ICityService {

    @Autowired
    protected CityRepository cityRepository;

    @Override
    @Transactional
    public City findById(long id) {
        Optional<City> city = cityRepository.findById(id);
        if(!city.isPresent()){
            throw new RuntimeException(String.format("Car not found with id = %s", id));
        }
        return city.get();
    }

    @Override
    public void addCity(City city) {
        cityRepository.save(city);
    }

    public List<City> findAllByCountry_Id(long countryId){
        return cityRepository.findAllByCountry_Id(countryId);
    }
}
