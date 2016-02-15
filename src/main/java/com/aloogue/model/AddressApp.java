package com.aloogue.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "address_app")
public class AddressApp implements Serializable {

    @Id
    @Column(name = "id_address_app")
    @GeneratedValue
    private Long id;

    @ManyToOne(targetEntity = StateFU.class,cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_state_uf")
    private StateFU stateFU;

    @ManyToOne(targetEntity = City.class,cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_city")
    private City city;

    @ManyToOne(targetEntity = Street.class,cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_street")
    private Street street;

    @Column
    private String number;

    @Column
    private String additional;

    @ManyToOne(targetEntity = Neighbourhood.class,cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_neighbourhood")
    private Neighbourhood neighbourhood;

    @ManyToOne(targetEntity = Country.class,cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_country")
    private Country country;

    @Column
    private double latitude;

    @Column
    private double longitute;

    @Override
    public String toString() {
        return
                this.street + ", " +
                        this.number + "- " +
                        this.neighbourhood + "- " +
                        this.city.getDescription() + "- " +
                        this.stateFU.getDescription() + "- " +
                        this.country.getDescription();
    }
    //todo: sobrescrever métodos equals...hash...tostring
}
