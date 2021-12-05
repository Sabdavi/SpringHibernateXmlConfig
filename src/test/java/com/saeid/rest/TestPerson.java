package com.saeid.rest;


import com.saeid.entity.Person;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.get;

public class TestPerson {
    @Test
    public void testCreatePerson(){
        get("http://localhost:8081/persons").then().assertThat()
                .statusCode(200);

        Person[] persons = get("http://localhost:8081/persons")
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .as(Person[].class);
    }
}
