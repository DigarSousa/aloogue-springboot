package com.aloogue.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    public void saveUser() {
        UserApp toSave = getUser();

        when(userRepository.save(toSave)).thenReturn(toSave);

        UserApp savedUser = userService.saveUser(toSave);

        assertThat(savedUser).isNotNull();
        assertThat(savedUser.getId()).isEqualTo(1l);
    }

    @Test
    public void findUserByMailAndPassword() {
        UserApp userApp = getUser();
        when(userRepository.findByEmailAndPassword("name@mail.com", "pass")).thenReturn(userApp);

        UserApp returnedUser = userService.login("name@mail.com", "pass");
        assertThat(returnedUser).isNotNull();
        assertThat(returnedUser.getName()).isEqualTo("name");
    }


    private UserApp getUser() {
        return new UserApp(1l, "name", "name@mail.com", "pass");
    }

}
