package com.aloogue.model;

import com.aloogue.model.place.Place;
import com.auth0.jwt.internal.com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class Address implements Serializable {

    @Id
    @GeneratedValue
    @Column(name="id_address")
    private Long id;

    @Column
    private String country;

    @Column(name="state_fu")
    private String stateFU;

    @Column
    private String city;

    @Column
    private String neighbourhood;

    @Column
    private String street;

    @Column
    private String zipCode;

    @Column
    private Long number;

    @Column
    private Double latitude;

    @Column
    private Double longitude;

    @JsonBackReference
    @JsonIgnore
    @OneToOne(targetEntity = Place.class,fetch = FetchType.LAZY)
    @JoinColumn(name = "id_place")
    private Place place;
}
