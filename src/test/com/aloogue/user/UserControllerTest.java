package com.aloogue.user;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.Mockito.when;

import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {

    @Mock
    private UserService userService;

    @InjectMocks
    private UserController userController;

    @Test
    public void saveUser() {
        UserApp toSave = UserApp.builder().id(1L).name("name").build();

        when(userService.saveUser(toSave)).thenReturn(toSave);

        UserApp returnedUser = userController.saveUser(toSave).getBody();

        assertThat(returnedUser).isNotNull();
        assertThat(returnedUser.getName()).isEqualTo("name");
        assertThat(returnedUser.getId()).isEqualTo(1l);
    }

    @Test
    public void doLogin() {
        UserApp toFind = UserApp.builder().name("name").email("name@mail.com").password("pass").build();
        when(userService.login("name@mail.com", "pass123")).thenReturn(toFind);

        UserApp returnedUser = userController.login("name@mail.com", "pass123").getBody();
        assertThat(returnedUser).isNotNull();
        assertThat(returnedUser.getName()).isEqualTo("name");
    }
}
