package com.example.crudcars.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Entity(name = "cars")
@RequiredArgsConstructor
public class Car{
    @Id
    long id;
    String brand;
    String model;
    String createdCountry;
}
