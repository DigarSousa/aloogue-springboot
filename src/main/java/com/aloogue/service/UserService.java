package com.aloogue.service;

import com.aloogue.model.user.UserApp;
import com.aloogue.model.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by edgar on 23/01/16.
 */
@Component
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void saveUser(UserApp user) {
        userRepository.save(user);
    }

    public UserApp getUser(Integer id) {
        return userRepository.findOne(id);
    }

    public void deleteUser(UserApp userApp) {
        userRepository.delete(userApp);
    }

    public String login(String login) {
        return login;
    }
}
