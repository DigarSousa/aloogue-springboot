package com.aloogue.controller;

import com.aloogue.model.file.PictureFile;
import com.aloogue.model.user.UserApp;
import com.aloogue.service.PictureProfileService;
import com.aloogue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private PictureProfileService pictureProfileService;

    @RequestMapping(method = RequestMethod.GET)
    public UserApp login(@RequestParam String email, @RequestParam String password) {
        return userService.login(email, password);
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

    @RequestMapping(value = "/picture", method = RequestMethod.GET, produces = MediaType.IMAGE_PNG_VALUE)
    public PictureFile getProfilePicture(@RequestBody Long id) {
        return pictureProfileService.getPictureByUser(id);
    }
}
