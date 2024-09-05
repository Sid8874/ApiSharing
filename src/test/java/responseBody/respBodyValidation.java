package responseBody;

import org.testng.annotations.Test;

import POJOClasses.CreatePojo;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

public class respBodyValidation {
	
	@Test
	public void responseBody()
	{
		String expectedInfo="Raja";
		baseURI="https://reqres.in/";
		CreatePojo cp=new CreatePojo("Raja", "manager");
		Response resp = given().body(cp).contentType(ContentType.JSON)
				.when().post("api/users/");
		String actualInfo = resp.jsonPath().get("name");
		Assert.assertEquals(actualInfo,expectedInfo);
		System.out.println("Assertion passed!!");
	}
		
}
