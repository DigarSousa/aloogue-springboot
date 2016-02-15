package com.aloogue.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table
public class Neighbourhood implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_neighbourhood")
    private Long id;

    @Column
    private String description;
}
