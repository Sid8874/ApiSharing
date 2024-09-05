package requestUsingHashmap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class CreateRequestBodyBy_JSON_FILE {

	@Test
	public void createRequest()
	{
		File f=new File(".\\details.json");
		
		given().body(f).contentType(ContentType.JSON)
		.when().post("https://reqres.in/api/users")
		.then().assertThat().statusCode(201).log().all();
	}
}
