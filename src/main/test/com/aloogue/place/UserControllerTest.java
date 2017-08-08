package com.aloogue.place;

import com.aloogue.user.UserApp;
import com.aloogue.user.UserController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import static org.mockito.Mockito.doReturn;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {

    @Mock
    private UserController userController;

    @Test
    public void saveUser() {
        UserApp userApp = new UserApp();


        doReturn(userApp).when(userController.saveUser(userApp));

    }
}
