import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    @BeforeEach
    public void setUp() {
        RestAssured.baseURI = "https://postman-echo.com";
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }
}