package com.aloogue.model;

import com.orm.SugarRecord;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by Pedreduardo on 30/11/2015.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class City extends SugarRecord {

    public City() {
    }

    private Long id;
    private String description;
}
