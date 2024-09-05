package requestChaining;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class RCbyRestAssuredpg1 {
	
	@Test
	public void requestChaining()
	{
		baseURI="https://reqres.in/";
		//request1: read all  data
		when().get("api/users")
		.then().assertThat().statusCode(200).log().all();
		
		//request 2:- read only id number
		int id=when().get("api/users").jsonPath().get("data[0].id");
		System.out.println(id);
		
		//request 3:- read all details about id number 1
		when().get("api/users"+id)
		.then().assertThat().statusCode(200).log().all();
		
		//request 4:- delete id number 1 details
		when().get("api/users"+id)
		.then().assertThat().statusCode(204).log().all();		
	}
	

}
