import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class HeadTest extends BaseTest {

    @Test
    public void testHeadRequest() {
        given()
                .queryParam("foo", "bar")
                .log().all()
                .when()
                .head("/head")
                .then()
                .log().all()
                .statusCode(200)
                .header("Server", notNullValue())
                .header("Connection", equalTo("keep-alive"));
    }
}