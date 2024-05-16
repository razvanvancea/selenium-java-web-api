import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.response.Response;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RestApiTest {

    @Test
    public void testResponseCode()
    {
        Response response = get("https://jsonplaceholder.typicode.com/posts");
        int code = response.getStatusCode();

        System.out.println("The code is: "+ code);
        Assert.assertEquals(code, 200);
    }

    @Test
    public void testBody()
    {
        Response response = get("https://jsonplaceholder.typicode.com/posts");
        long responseTime = response.getTime();
        String data = response.asString();

        System.out.println("The response time is: "+ responseTime);
//        System.out.println("The response data is: "+ data);
        Assert.assertTrue(data.contains("title"));
    }

}
