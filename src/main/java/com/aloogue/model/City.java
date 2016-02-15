package com.aloogue.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table
public class City implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id_city")
    private Long id;

    @Column
    private String description;
}
