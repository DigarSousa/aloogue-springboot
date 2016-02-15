package com.aloogue.model.place;

import com.aloogue.model.AddressApp;
import com.aloogue.model.Phone;
import com.aloogue.model.user.UserApp;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table
public class Place implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_place")
    private Long id;

    @Column(name = "cpf_cnpj")
    private String cpfCnpj;

    @Column
    private String name;

    @ManyToOne(targetEntity = UserApp.class)
    @JoinColumn(name = "id_user_app")
    private UserApp userApp;

    @OneToOne(targetEntity = AddressApp.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_address_app")
    private AddressApp addressApp;

    @OneToMany(targetEntity = Phone.class,cascade = CascadeType.ALL)
    @JoinTable(name = "place_phone", joinColumns = {
            @JoinColumn(name = "id_place")}, inverseJoinColumns = {
            @JoinColumn(name = "id_phone")})
    private List<Phone> phones;

    @Column
    private String businessInitialHour;
    @Column
    private String businessFinalHour;
}
