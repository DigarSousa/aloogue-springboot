package com.aloogue.facade;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {
    @RequestMapping("/galo")
    public String greeting() {
        return "galo";
    }
}
