package com.aloogue.address;

import com.aloogue.place.Place;
import com.auth0.jwt.internal.com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@SequenceGenerator(name = "address_sequence", allocationSize = 1)
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_sequence")
    @Column(name = "id_address")
    private Long id;

    @Column
    private String country;

    @Column(name = "state_fu")
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
    @OneToOne(targetEntity = Place.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_place")
    private Place place;
}
