package com.horang.HorangCoffeeBackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Coffee {

    @Id
    @GeneratedValue
    @Column(name = "coffee_id")
    private Long id;

    private String name;

    private String bean;

    private String origin;

}
