package com.aloogue.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserApp saveUser(UserApp user) {
        if (userRepository.findByEmail(user.getEmail()) != null) {
            return null;
        }
        return userRepository.save(user);
    }

    public void deleteUser(UserApp userApp) {
        userRepository.delete(userApp);
    }

    public UserApp login(String email, String password) {
        return (UserApp) userRepository.findByEmailAndPassword(email, password);
    }
}
