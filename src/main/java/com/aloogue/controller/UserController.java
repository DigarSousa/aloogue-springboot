package com.aloogue.controller;

import com.aloogue.model.user.UserApp;
import com.aloogue.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "user")
public class UserController {
    @RequestMapping(method = RequestMethod.GET)
    public UserApp getUser(@RequestBody Integer id) {
        return UserService.getUser(id);

    }

    @RequestMapping(method = RequestMethod.POST)
    public Boolean saveUser(@RequestBody UserApp userApp) {
        return UserService.saveUser(userApp);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Boolean updateUser(@RequestBody UserApp userApp) {
        return true;
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public Boolean deleteUser(@RequestBody UserApp userApp) {
        return true;
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public Boolean login(@RequestBody String login) {
        return true;
    }
}
