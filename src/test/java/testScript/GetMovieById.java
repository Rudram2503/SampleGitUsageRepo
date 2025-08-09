package testScript;

import org.testng.annotations.Test;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class GetMovieById extends BaseClass {

    @Test
    public void viewMovieById() throws Exception {
        given()
            .header("Authorization", "Bearer " + authCode)
            .accept(ContentType.JSON)
        .when()
            .get(baseUrl + utils.readData("movieByIdEndpoint") + "15001") // or use utils.readData("movieId")
        .then()
            .statusCode(200)
            .log().all();
    }
}
