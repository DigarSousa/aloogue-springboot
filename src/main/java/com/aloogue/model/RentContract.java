package com.aloogue.model;

import com.aloogue.model.user.UserApp;
import lombok.Data;

import java.util.Date;

/**
 * Created by Pedreduardo on 16/10/2015.
 */
@Data
public class RentContract {

    private Long id;
    private String description;
    private UserApp userApp;
    private Place place;
    //todo: Criar model ... private Long chargeEvent;
    private Date initialEffective;
    private Date finalEffective;
    private Long quantity;
    private Rating rating;
}
