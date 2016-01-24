package com.aloogue.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by edgar on 30/11/2015.
 */
@Data
@Entity
@Table(name = "address_app")
public class AddressApp {

    @Id
    @Column(name = "id_address_app")
    private Long id;

    @ManyToOne(targetEntity = StateFU.class)
    @JoinColumn()
    private StateFU stateFU;

    @ManyToOne(targetEntity = City.class)
    @JoinColumn(name = "id_city")
    private City city;

    @ManyToOne(targetEntity = Neighbourhood.class)
    @JoinColumn(name = "id_neighbourhood")
    private Neighbourhood neighbourhood;

    @ManyToOne(targetEntity = Country.class)
    @JoinColumn(name = "id_country")
    private Country country;

    @ManyToOne(targetEntity = Street.class)
    @JoinColumn(name = "id_street")
    private Street street;

    @Column
    private String number;

    @Column
    private String additional;

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
}
