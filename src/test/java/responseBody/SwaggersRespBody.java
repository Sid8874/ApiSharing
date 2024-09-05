package responseBody;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import static org.testng.annotations.Test.*;

import org.testng.annotations.Test;

import POJOClasses.CreatePojo;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import junit.framework.Assert;

public class SwaggersRespBody {
	@Test
	public void respBody() {
	String expectedEmail="www.deepak@gmail.com";
	baseURI="https://reqres.in/api";
	CreatePojo cp=new CreatePojo("Deep_ak", "manager","www.deepak@gmail.com","12deepak");
	Response resp = given().body(cp).contentType(ContentType.JSON)
			.when().post("api-docs/#/default/post_login/");
	String actualEmail = resp.jsonPath().get("email");
	Assert.assertEquals(actualEmail,expectedEmail);
	System.out.println("Assertion passed!!");
}
}
