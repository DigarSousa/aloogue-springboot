package com.aloogue.model.product;

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
    private String description;
}
