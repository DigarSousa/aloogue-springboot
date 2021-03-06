package com.aloogue.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<UserApp> login(@RequestParam String email, @RequestParam String password) {
        UserApp userApp = userService.login(email, password);
        if (userApp != null) {
            return new ResponseEntity<>(userApp, HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<>(UserApp.builder().build(), HttpStatus.UNAUTHORIZED);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<UserApp> saveUser(@RequestBody UserApp userApp) {
        UserApp savedUser = userService.saveUser(userApp);
        HttpStatus httpStatus = savedUser != null ? HttpStatus.CREATED : HttpStatus.CONFLICT;
        return new ResponseEntity<UserApp>(savedUser, httpStatus);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    @ResponseStatus(code = HttpStatus.OK)
    public void deleteUser(@RequestBody UserApp userApp) {
        userService.deleteUser(userApp);
    }

}
