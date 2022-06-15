package com.example.crudcars.service;

import com.example.crudcars.model.Country;

public interface ICountryService {
    void addCountry(Country country);

    Country findById(long id);
}
