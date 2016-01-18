package com.aloogue.service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserService {

    //Todo:... receive the user by post method and save it.
    @RequestMapping(value="/galo")
    public String saveUser() {
        return "galão da massa";
    }
}
