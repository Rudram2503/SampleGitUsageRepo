package testScript;

import org.testng.annotations.Test;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class GetMovieList extends BaseClass {

    @Test
    public void viewMovieList() throws Exception {
        given()
            .header("Authorization", "Bearer " + authCode)
            .accept(ContentType.JSON)
        .when()
            .get(baseUrl + utils.readData("movieListEndpoint"))
        .then()
            .log().all();
    }
}
