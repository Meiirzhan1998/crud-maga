package com.example.crud.service;

import com.example.crud.model.Country;
import com.example.crud.repository.CountryRepository;
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
