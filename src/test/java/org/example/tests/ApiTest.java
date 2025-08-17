package org.example.tests;

import io.restassured.response.Response;
import org.example.RestAssuredApi;
import org.testng.Assert;
import org.testng.annotations.Test;


//test API response for getting a user ID
//checks if the status code is 200
public class ApiTest {

    @Test
    public void checkUserStatusCode() {

        RestAssuredApi api = new RestAssuredApi();
        Response response = api.getUserId(2);

        Assert.assertEquals(response.getStatusCode(), 200, "Status code should be 200");
    }


    @Test
    public void checkAnotherUserStatusCode() {

        RestAssuredApi api = new RestAssuredApi();
        Response response = api.getUserId(3);

        Assert.assertEquals(response.getStatusCode(), 200, "Status code should be 200");
    }

}
