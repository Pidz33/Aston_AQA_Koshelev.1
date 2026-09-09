import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class PutTest extends BaseTest {

    @Test
    public void testPutRequest() {
        String requestBody = "{\"id\": 1, \"name\": \"Updated Name\"}";

        given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .queryParam("version", "2")
                .log().body()
                .when()
                .put("/put")
                .then()
                .log().body()
                .statusCode(200)
                .body("url", containsString("/put?version=2"))
                .body("args.version", equalTo("2"))
                .body("json.id", equalTo(1))
                .body("json.name", equalTo("Updated Name"))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.content-type", equalTo("application/json"));
    }
}