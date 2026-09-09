import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class GetTest extends BaseTest {

    @Test
    public void testGetRequest() {
        given()
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .log().body()
                .when()
                .get("/get")
                .then()
                .log().body()
                .statusCode(200)
                // Проверяем все поля ответа
                .body("url", containsString("/get?foo1=bar1&foo2=bar2"))
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.accept", containsString("*/*"))
                .body("headers.accept-encoding", containsString("gzip"))
                .body("headers.user-agent", notNullValue());
    }
}