import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class PostTest extends BaseTest {

    @Test
    public void testPostRequest() {
        String requestBody = "{\"name\": \"Alice\", \"age\": 30}";

        given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .queryParam("param1", "value1")
                .log().body()
                .when()
                .post("/post")
                .then()
                .log().body()
                .statusCode(200)
                .body("url", containsString("/post?param1=value1"))
                .body("args.param1", equalTo("value1"))
                .body("json.name", equalTo("Alice"))
                .body("json.age", equalTo(30))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.accept", containsString("*/*"))
                .body("headers.accept-encoding", containsString("gzip"))
                .body("headers.content-type", equalTo("application/json"))
                .body("headers.content-length", notNullValue());
    }
}