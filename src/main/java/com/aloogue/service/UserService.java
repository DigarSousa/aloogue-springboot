package com.aloogue.service;

import com.aloogue.model.user.UserApp;
import com.aloogue.model.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void saveUser(UserApp user) {
        userRepository.save(user);
    }

    public void deleteUser(UserApp userApp) {
        userRepository.delete(userApp);
    }

    public UserApp login(String email, String password) {
        return (UserApp) userRepository.findByEmailAndPassword(email, password);
    }
}
