package requestUsingHashmap;

import POJOClasses.CreatePojo;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class CreateRequestBodyBy_POJO_Class {
	@Test
	public void createRequest()
	{
		CreatePojo cp=new CreatePojo("JANANI", "Teacher");
		CreatePojo cp1=new CreatePojo("JANANI", "Teacher","belagavi");
		
		given().body(cp1).contentType(ContentType.JSON)
		.when().post("https://reqres.in/api/users")
		.then().assertThat().statusCode(201).log().all();
		
	}
}
