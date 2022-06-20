package com.example.crud.service;

import com.example.crud.model.Country;
import com.example.crud.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements ICountryService {

    @Autowired
    CountryRepository countryRepository;


    @Override
    public void create(Country country) {
        countryRepository.save(country);
    }

    @Override
    public Country read(long id) {
        return countryRepository.findById(id);
    }

    @Override
    public Country update(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public void delete(long id) {
        countryRepository.deleteById(id);
    }
}
