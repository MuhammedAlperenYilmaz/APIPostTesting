import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
public class API_PostRequest {
    @Test
    public void post() {
        //1. Create a Request URL and Body
        String url = "https://jsonplaceholder.typicode.com/posts";
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "API");
        requestBody.put("body", "API Testing");
        requestBody.put("userId", 10);
        //2. Create expected data

        JSONObject expectedBody = new JSONObject();
        expectedBody.put("title", "API");
        expectedBody.put("body", "API Testing");
        expectedBody.put("userId", 10);
        //3. Save a Respose
        Response response = RestAssured.given().contentType(ContentType.JSON).when().body(expectedBody.toString()).post(url);
        JsonPath actualBody = response.jsonPath();
        //4. Assertion
        response.then().assertThat().contentType(ContentType.JSON).statusCode(201);
        Assert.assertEquals(expectedBody.get("title"), actualBody.get("title"));
        Assert.assertEquals(expectedBody.get("body"), actualBody.get("body"));
        Assert.assertEquals(expectedBody.get("userId"), actualBody.get("userId"));
    }
}
