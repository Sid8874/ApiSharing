package requestUsingHashmap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateRequestBodyBY_JSON_obj {
	@Test
	public void createRequest()
	{
		JSONObject obj=new JSONObject();
		obj.put("name", "Siddharth");
		obj.put("job", "Manual TestEngineer");
		
		given().body(obj).contentType(ContentType.JSON)
		.when().post("https://reqres.in/api/users")
		.then().assertThat().statusCode(201).log().all();
	}
}
