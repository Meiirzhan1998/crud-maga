package com.example.crudcars.service;

import com.example.crudcars.model.Country;
import com.example.crudcars.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CountryServiceImpl implements ICountryService {

    @Autowired
    protected CountryRepository countryRepository;


    @Override
    @Transactional
    public void addCountry(Country country) {
        countryRepository.save(country);
    }

    @Override
    public Country findById(long id) {
        return countryRepository.findById(id);
    }
}
