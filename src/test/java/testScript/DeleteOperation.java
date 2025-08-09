package testScript;

import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import pojo.DeleteMovie;

import static io.restassured.RestAssured.*;

public class DeleteOperation extends BaseClass {

    @Test
    public void deleteMovieUsingPojo() throws Exception {
        DeleteMovie deleteRequest = new DeleteMovie(utils.readData("movieId"));

        given()
            .header("Authorization", "Bearer " + authCode)
            .accept(ContentType.JSON)
            .body(deleteRequest)  
        .when()
            .delete(baseUrl + utils.readData("deleteMovieEndpoint") + deleteRequest.getMovieId())
        .then()
            .log().all();
    }
}
