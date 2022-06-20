package com.example.crud.service;

import com.example.crud.model.Country;

public interface ICountryService {
    void create(Country country);

    Country read(long id);

    Country update(Country country);

    void delete(long id);
}
