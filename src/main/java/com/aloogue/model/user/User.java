package com.aloogue.model.user;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by edgar on 03/01/16.
 */
@Entity
@Table(name = "User")
@Data
public class User {
    @Id
    @Column
    @GeneratedValue
    private Integer id;

    @Column
    private String name;
}
