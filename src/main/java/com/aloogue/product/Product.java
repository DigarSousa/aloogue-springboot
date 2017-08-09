package com.aloogue.product;

import com.aloogue.place.Place;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data

@Entity
@Table
public class Product implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_product")
    private Long id;

    @Column
    private String code;

    @Column
    private String name;

    @Column
    private String description;

    @ManyToOne(targetEntity = Place.class)
    @JoinColumn(name = "id_place")
    private Place place;

    @Column
    private Double price;

    @Column(name = "RENT_TYPE")
    private String rentType;
}
