package com.aloogue.model.place;

import com.aloogue.model.Address;
import com.aloogue.model.Phone;
import com.aloogue.model.user.UserApp;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table

@Getter
@Setter
public class Place implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_place")
    private Long id;

    @Column(name = "cpf_cnpj")
    private String cpfCnpj;

    @Column
    private String name;

    @Column
    private String businessInitialHour;

    @Column
    private String businessFinalHour;

    @OneToOne(targetEntity = UserApp.class)
    @JoinColumn(name = "id_user_app")
    private UserApp userApp;

    @OneToMany(targetEntity = Phone.class, cascade = CascadeType.ALL)
    @JoinTable(name = "place_phone", joinColumns = {
            @JoinColumn(name = "id_place")}, inverseJoinColumns = {
            @JoinColumn(name = "id_phone")})
    private List<Phone> phones;

    @JsonManagedReference
    @OneToOne(mappedBy = "place", cascade = CascadeType.ALL)
    private Address address;
}
