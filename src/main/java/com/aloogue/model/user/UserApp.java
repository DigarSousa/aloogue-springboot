package com.aloogue.model.user;

import lombok.Data;

import javax.persistence.*;


/**
 * Created by Pedreduardo on 16/10/2015.
 */
@Data
@Entity
@Table(name = "user_app")
public class UserApp {

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
    /*@ManyToOne(targetEntity = AddressApp.class)
    @JoinTable(name="")
    private AddressApp addressApp;*/

    @Column
    private byte[] picture;

    /*@OneToMany(targetEntity = Phone.class)
    @JoinTable(name = "user_app_phone", joinColumns = {
            @JoinColumn(name = "id_user_app")}, inverseJoinColumns = {
            @JoinColumn(name = "id_phone")})
    private List<Phone> phones;*/


}
