package com.aloogue.facade;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/galo")
public class User {
    //Todo: create the user Repository... receive the user by post method and save it.
    @RequestMapping(method = RequestMethod.POST)
    public String greeting() {
        return "treta";
    }
}
