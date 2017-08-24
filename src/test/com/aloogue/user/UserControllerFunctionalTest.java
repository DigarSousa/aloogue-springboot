package com.aloogue.user;

import static io.restassured.RestAssured.*;

import com.aloogue.FunctionalTest;
import org.apache.http.HttpStatus;
import org.junit.Test;

public class UserControllerFunctionalTest extends FunctionalTest {

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

    private void createUser(UserApp userApp) {
        given().contentType("application/json")
                .body(userApp)
                .when()
                .post("/user")
                .then()
                .statusCode(HttpStatus.SC_CREATED);
    }

}
