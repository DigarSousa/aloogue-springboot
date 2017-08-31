package com.aloogue.place;

import com.aloogue.FunctionalTest;
import org.apache.http.HttpStatus;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PlaceControllerFunctionalTest extends FunctionalTest {
    @Test
    public void return201OnSave() {
        Place place = Place.builder().name("little").phone("434343").build();

        given().contentType("application/json")
                .body(place)

                .expect()
                .statusCode(HttpStatus.SC_CREATED)

                .when()

                .post("/place");
    }

}

