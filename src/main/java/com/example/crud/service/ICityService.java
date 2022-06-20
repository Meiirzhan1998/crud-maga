package com.example.crud.service;

import com.example.crud.model.City;

import java.util.List;

public interface ICityService {
    void create(City city);
    City read(long id);

    City update(City city);

    void delete(long id);

    List<City> findAllByCountry_Id(long countryId);
}
