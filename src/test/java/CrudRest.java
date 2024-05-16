import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CrudRest {

    @BeforeSuite
    public static void setup() {
        RestAssured.baseURI = "http://localhost:3112";
    }

    @Test
    public void postRequest() {

        String requestBody = "{\"firstName\":\"Razvan\",\"lastName\":\"Smith\",\"dob\":\"1976-01-23\",\"email\":\"iamqarv@gmail.com\",\"createdAt\":\"2024-04-01\"}";

        Response response = given()
                .header("Content-type", "application/json")
                .and()
                .body(requestBody)
                .when()
                .post("/employees")
                .then()
                .extract().response();

        int code = response.getStatusCode();

        Assert.assertEquals(code, 201);
    }

}
