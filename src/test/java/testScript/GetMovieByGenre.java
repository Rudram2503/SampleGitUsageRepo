package testScript;

import org.testng.annotations.Test;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class GetMovieByGenre extends BaseClass {

    @Test
    public void viewMovieByGenre() throws Exception {
        given()
            .header("Authorization", "Bearer " + authCode)
            .accept(ContentType.JSON)
            .queryParam("genre", utils.readData("genre"))
        .when()
            .get(baseUrl + utils.readData("movieByGenreEndpoint"))
        .then()
            .statusCode(200)
            .log().all();
    }
}
