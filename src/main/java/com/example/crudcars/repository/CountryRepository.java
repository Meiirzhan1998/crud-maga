package com.example.crudcars.repository;

import com.example.crudcars.model.Car;
import com.example.crudcars.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

    Country findById(long id);

//    List<Car> findCarsByCountry_Id(long country_id);
}
