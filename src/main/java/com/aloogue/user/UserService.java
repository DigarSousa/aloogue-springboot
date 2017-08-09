package com.aloogue.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public ResponseEntity<UserApp> saveUser(UserApp user) {
        if (userRepository.findByEmail(user.getEmail()) != null) {
            return new ResponseEntity<>(new UserApp(), HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>(userRepository.save(user), HttpStatus.ACCEPTED);
    }

    public void deleteUser(UserApp userApp) {
        userRepository.delete(userApp);
    }

    public UserApp login(String email, String password) {
        return (UserApp) userRepository.findByEmailAndPassword(email, password);
    }
}
