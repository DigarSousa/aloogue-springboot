package com.aloogue.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table
public class StateFU implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id_state_fu")
    private Long id;

    @Column
    private String description;


}
