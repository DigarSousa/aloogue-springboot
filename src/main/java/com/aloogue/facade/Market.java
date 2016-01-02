package com.aloogue.facade;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by edgar on 02/01/16.
 */
@RestController
public class Market {

    @RequestMapping("/treta")
    public String getTretas() {
        return "treta";
    }
}
