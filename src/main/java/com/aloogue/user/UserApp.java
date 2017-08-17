package com.aloogue.user;

import lombok.*;

import javax.persistence.*;
import javax.print.attribute.standard.MediaSize;
import java.io.Serializable;

@Getter
@Builder
@Entity
@Table(name = "user_app", uniqueConstraints = @UniqueConstraint(columnNames = {"email"}))
@SequenceGenerator(name = "user_sequence", allocationSize = 1)
public class UserApp implements Serializable {

    @Id
    @Column(name = "id_user_app")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_sequence")
    private Long id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String password;
}
