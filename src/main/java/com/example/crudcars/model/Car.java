package com.example.crudcars.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String brand;

    private String model;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY,cascade = {CascadeType.ALL})
    private Country country;
}
