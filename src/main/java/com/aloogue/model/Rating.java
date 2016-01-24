package com.aloogue.model;

import com.aloogue.model.user.UserApp;
import lombok.Data;

/**
 * Created by Pedreduardo on 16/10/2015.
 */
@Data
public class Rating {


    private Long id;
    private UserApp offerer;
    private UserApp professional;
    private Long rating;

}
