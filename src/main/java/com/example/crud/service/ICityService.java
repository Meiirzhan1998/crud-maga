package com.example.crud.service;

import com.example.crud.model.City;

import java.util.List;

public interface ICityService {
    City findById(long id);

    void addCity(City city);

    List<City> findAllByCountry_Id(long countryId);
}
