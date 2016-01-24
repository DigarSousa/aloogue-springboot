package com.aloogue.service;

import com.aloogue.model.user.UserApp;
import com.aloogue.model.user.UserRepository;

/**
 * Created by edgar on 23/01/16.
 */
public class UserService {
    private static UserRepository userRepository;

    public static Boolean saveUser(UserApp user) {
        userRepository.save(user);
        return true;
    }

    public static UserApp getUser(Integer id) {
        return userRepository.findOne(id);
    }
}
