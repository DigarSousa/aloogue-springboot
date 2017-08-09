package com.aloogue.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_app",uniqueConstraints = @UniqueConstraint(columnNames = {"email"}))
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
