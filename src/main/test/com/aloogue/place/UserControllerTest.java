package com.aloogue.place;

import com.aloogue.user.UserApp;
import com.aloogue.user.UserController;

import static org.assertj.core.api.Assertions.assertThat;

import com.aloogue.user.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.Mockito.when;

import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {

    @Mock
    private UserService userService;

    @InjectMocks
    private UserController userController;

    @Test
    public void saveUser() {
        UserApp toSave = getCompletUser();
        when(userService.saveUser(toSave)).thenReturn(new ResponseEntity<UserApp>(toSave, HttpStatus.OK));

        UserApp returnedUser = userController.saveUser(toSave).getBody();

        assertThat(returnedUser).isNotNull();
        assertThat(returnedUser.getName()).isEqualTo("name");
        assertThat(returnedUser.getId()).isEqualTo(1l);
    }

    @Test
    public void doLogin(){
        UserApp toFind= getCompletUser();
        when(userService.login("name@mail.com","pass123")).thenReturn(toFind);

        UserApp returnedUser= userController.login("name@mail.com", "pass123").getBody();
        assertThat(returnedUser).isNotNull();
        assertThat(returnedUser.getName()).isEqualTo("name");
    }

    public UserApp getCompletUser() {
        return new UserApp(1l, "name","name@mail.com","pass123");
    }
}
