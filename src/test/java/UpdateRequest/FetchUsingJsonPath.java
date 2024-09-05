package UpdateRequest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class FetchUsingJsonPath {

	@Test
	public void fetchUsingJsonPath()
	{
		//Request for update
		baseURI="https://reqres.in/";
		Response resp=when().get("/api/unknown/2");
	
		String obj=resp.jsonPath().get("data.name");
				System.out.println(obj);
	}
}
