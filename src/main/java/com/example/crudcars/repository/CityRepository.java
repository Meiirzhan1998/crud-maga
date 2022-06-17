package com.example.crudcars.repository;


import com.example.crudcars.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CityRepository  extends JpaRepository<City, Long> {
    List<City> findAllByCountry_Id(long countryId);
}


