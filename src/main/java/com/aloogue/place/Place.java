package com.aloogue.place;

import com.aloogue.address.Address;
import com.aloogue.user.UserApp;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
@SequenceGenerator(name = "place_sequence", allocationSize = 1)
public class Place implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "place_sequence")
    @Column(name = "id_place")
    private Long id;

    @Column(name = "cpf_cnpj")
    private String cpfCnpj;

    @Column
    private String name;

    @Column
    private String startHour;

    @Column
    private String finishHour;

    @OneToOne(targetEntity = UserApp.class)
    @JoinColumn(name = "id_user_app")
    private UserApp userApp;

    @Column
    private String phone;

    @JsonManagedReference
    @OneToOne(mappedBy = "place", cascade = CascadeType.ALL)
    private Address address;
}
