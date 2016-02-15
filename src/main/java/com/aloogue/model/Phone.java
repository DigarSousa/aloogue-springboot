package com.aloogue.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table
public class Phone implements Serializable{

    @Id
    @GeneratedValue
    @Column(name = "id_phone")
    private Long id;

    @Column
    private String number;
}
