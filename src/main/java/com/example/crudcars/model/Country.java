package com.example.crudcars.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name = "countries")
@RequiredArgsConstructor
public class Country {
    @Id
    long id;
    String name;
}
