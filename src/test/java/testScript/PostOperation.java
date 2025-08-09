package testScript;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class PostOperation extends BaseClass {

    @Test
    public void addMovieFormParams() throws Exception {
        given()
            .header("Authorization", "Bearer " + authCode)
            .contentType("application/x-www-form-urlencoded")
            .formParam("movieId", utils.readData("movieId"))
            .formParam("movieTitle", utils.readData("movieTitle"))
            .formParam("durationInMins", utils.readData("durationInMins"))
            .formParam("language", utils.readData("language"))
            .formParam("genre", utils.readData("genre"))
            .formParam("releaseDate", utils.readData("releaseDate"))
            .formParam("country", utils.readData("country"))
        .when()
            .post(baseUrl + utils.readData("addMovieEndpoint"))
        .then()
            .log().all();
    }
}
