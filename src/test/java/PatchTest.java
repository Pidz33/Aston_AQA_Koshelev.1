import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class PatchTest extends BaseTest {

    @Test
    public void testPatchRequest() {
        String requestBody = "{\"status\": \"active\"}";

        given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .log().body()
                .when()
                .patch("/patch")
                .then()
                .log().body()
                .statusCode(200)
                .body("url", containsString("/patch"))
                .body("json.status", equalTo("active"))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.content-type", equalTo("application/json"));
    }
}