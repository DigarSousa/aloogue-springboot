package com.aloogue.user;

import static io.restassured.RestAssured.*;

import com.aloogue.FunctionalTest;
import org.apache.http.HttpStatus;
import static org.hamcrest.Matchers.equalTo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserControllerFunctionalTest extends FunctionalTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void return201OnSave() {
        UserApp toSave = UserApp.builder().name("name").email("user@mail.com").password("pass").build();
        given().contentType("application/json")
                .body(toSave)
                .when()
                .post("/user")
                .then()
                .statusCode(HttpStatus.SC_CREATED);
    }

    @Test
    public void return202WithExpectedUser() {
        createUser(UserApp.builder().name("savedUser").email("mail@mail.com").password("pass123").build());

        given().param("email", "mail@mail.com")
                .param("password", "pass123")
                .when()
                .get("/user").
                then()
                .statusCode(HttpStatus.SC_ACCEPTED)
        .body("name", equalTo("savedUser"));
    }

    @Test
    public void return200WithEmptyBodyOnDelete() {
        UserApp savedUser = createUser(UserApp.builder().name("name").email("user@mail.com").build());
        given().contentType("application/json")
                .body(savedUser)
                .when()
                .delete("/user")
                .then()
                .statusCode(HttpStatus.SC_OK);

    }

    private UserApp createUser(UserApp userApp) {
        return userRepository.save(userApp);
    }

}
