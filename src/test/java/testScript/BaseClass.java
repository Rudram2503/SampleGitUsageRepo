package testScript;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;

import genericLibraries.DataUtilities;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class BaseClass {

    protected String baseUrl;
    protected DataUtilities utils;
    protected String authCode;

    @BeforeMethod
    public void setup() throws Exception {
        utils = new DataUtilities();
        baseUrl = utils.readData("baseUrl");

        String loginEndpoint = utils.readData("loginEndpoint");


        // Login to get authCode
        Response res = given()
                .header("Content-Type", "application/x-www-form-urlencoded")
                .formParam("username", utils.readData("username"))
                .formParam("password", utils.readData("password"))
        .when()
                .post(baseUrl + loginEndpoint);

        res.then().statusCode(200);

        authCode = res.jsonPath().getString("authCode");
    }

    public void tearDown() {
        Reporter.log("CRUD Operation Completed Successfully", true);
    }
}
