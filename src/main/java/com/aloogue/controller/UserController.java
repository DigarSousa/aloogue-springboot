package com.aloogue.controller;

import com.aloogue.model.user.Usuario;
import com.aloogue.model.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/galo",method = RequestMethod.POST)
    public String saveUser(@RequestBody Usuario usuario) {
        if(usuario ==null){
            return "nao chegou nada";
        }
        userRepository.save(usuario);
        if (userRepository.findAll()!=null){
            return "galão da massa";
        }
        return "erro";
    }
}
