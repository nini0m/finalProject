package org.example;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.example.utils.ConfigReader;

public class RestAssuredApi {


//get request to get user ID
    public Response getUserId(int userId) {

        String baseUrl = ConfigReader.get("apiUrl");

        return RestAssured
                .given()
                .when()
                .get(baseUrl + "/users/" + userId)
                .then()
                .extract()
                .response();
    }
}
