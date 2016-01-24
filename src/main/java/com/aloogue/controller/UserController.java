package com.aloogue.controller;

import com.aloogue.model.user.UserApp;
import com.aloogue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public UserApp getUser(@RequestBody Integer id) {
        return userService.getUser(id);

    }

    @RequestMapping(method = RequestMethod.POST)
    public void saveUser(@RequestBody UserApp userApp) {
        userService.saveUser(userApp);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void updateUser(@RequestBody UserApp userApp) {
        userService.saveUser(userApp);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteUser(@RequestBody UserApp userApp) {
        userService.deleteUser(userApp);
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(@RequestBody String login) {
        return userService.login(login);
    }
}
