package com.aloogue.user;

import static io.restassured.RestAssured.*;

import com.aloogue.FunctionalTest;
import org.apache.http.HttpStatus;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserControllerFunctionalTest extends FunctionalTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void return200WithExpectedUserAndId() {
        createUser(UserApp.builder().email("mail@mail.com").password("pass123").build());

        given().param("email", "mail@mail.com")
                .param("password", "pass123")
                .when()
                .get("/user").
                then()
                .statusCode(HttpStatus.SC_ACCEPTED);
    }

    @Test
    public void saveUserThenReturn201AndSavedUserWithId() {
        UserApp toSave = UserApp.builder().name("name").email("user@mail.com").password("pass").build();
        given().contentType("application/json")
                .body(toSave)
                .when()
                .post("/user")
                .then()
                .statusCode(HttpStatus.SC_CREATED);

    }

    private void createUser(UserApp userApp) {
        userRepository.save(userApp);
    }

}
