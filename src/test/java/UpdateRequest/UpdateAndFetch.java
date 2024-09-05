package UpdateRequest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class UpdateAndFetch {
	
	@Test
	public void modifyAndread()
	{
		//Request for update
		baseURI="https://reqres.in/";
		JSONObject obj=new JSONObject();
		obj.put("name", "JOHN CENA");
		obj.put("job", "Russling");
		
		given().body(obj).contentType(ContentType.JSON)
		.when().put("/api/users/2")
		.then().assertThat().statusCode(200).log().all();
		
		//request to read the data in different format
		Response resp=when().get("/api/users/2");
		String data1=resp.asString();
		System.out.println(data1);
		
		System.out.println("-----------");
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getContentType());
		System.out.println(resp.getTime());
		
	}

}
