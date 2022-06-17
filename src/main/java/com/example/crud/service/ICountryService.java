package com.example.crud.service;

import com.example.crud.model.Country;

public interface ICountryService {
    void addCountry(Country country);

    Country findById(long id);
}
