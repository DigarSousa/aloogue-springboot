package com.aloogue.model.user;

import com.aloogue.model.file.PictureFile;
import lombok.Data;

import javax.persistence.*;

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

    /*@OneToMany(targetEntity = Phone.class)
    @JoinTable(name = "user_app_phone", joinColumns = {
            @JoinColumn(name = "id_user_app")}, inverseJoinColumns = {
            @JoinColumn(name = "id_phone")})
    private List<Phone> phones;*/


}
