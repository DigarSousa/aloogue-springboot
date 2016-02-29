package com.aloogue.model.user;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "user_app")
public class UserApp implements Serializable {

    @Id
    @Column(name = "id_user_app")
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String password;
}
