import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class DeleteTest extends BaseTest {

    @Test
    public void testDeleteRequest() {
        String requestBody = "{\"reason\": \"test deletion\"}";

        given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .queryParam("id", "123")
                .log().body()
                .when()
                .delete("/delete")
                .then()
                .log().body()
                .statusCode(200)
                .body("url", containsString("/delete?id=123"))
                .body("args.id", equalTo("123"))
                .body("json.reason", equalTo("test deletion"))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.content-type", equalTo("application/json"));
    }
}