package com.aloogue.user;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Builder
@Entity
@Table(name = "user_app", uniqueConstraints = @UniqueConstraint(columnNames = {"email"}))
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
