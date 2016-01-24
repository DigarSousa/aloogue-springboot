package com.aloogue.model;

import com.aloogue.model.user.UserApp;
import lombok.Data;

import java.util.List;

/**
 * Created by Pedreduardo / Eddgar on 02/12/2015.
 */
@Data
public class Place {


    private Long id;
    private String cpfCnpj;
    private String name;
    private UserApp userApp;
    private AddressApp addressApp;
    private byte[] picture;
    private List<Phone> phones;
    private String businessInitialHour;
    private String businessFinalHour;

    //todo: sobrescrever métodos equals...hash...tostring
}
