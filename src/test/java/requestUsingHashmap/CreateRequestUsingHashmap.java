package requestUsingHashmap;

import java.util.HashMap;

import org.junit.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateRequestUsingHashmap {
	@Test
	public void createRequest()
	{
	
		HashMap hm=new HashMap();
		hm.put("name","raja");
		hm.put("job", "manager");
		
		given().body(hm).contentType(ContentType.JSON)
		.when().post("https://reqres.in/api/users")
		.then().assertThat().statusCode(201).log().all();
	}
}
