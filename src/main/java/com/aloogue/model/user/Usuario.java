package com.aloogue.model.user;

import lombok.Data;
import org.hibernate.validator.constraints.Email;

import javax.persistence.*;

/**
 * Created by edgar on 03/01/16.
 */
@Entity
@Table(name = "Usuario")
@Data
public class Usuario {
    @Id
    @Column(name="id_user")
    @GeneratedValue
    private Integer id;

    @Column(name="email")
    @Email
    private String email;
}
