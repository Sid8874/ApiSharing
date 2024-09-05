package complexDataValidation;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.Iterator;
import java.util.List;

public class ComplexValidation {
	
	@Test
	public void complexDataValidation()
	{
		String expectedData="Ramos";
		baseURI="https://reqres.in/";
		Response resp = when().get("api/users");
		List<Object> allData=resp.jsonPath().getList("data");
		Iterator<Object> itr=allData.iterator();
		while(itr.hasNext())
		{
			String actualInfo=itr.next().toString();
			if(actualInfo.contains(expectedData))
			{
				System.out.println(actualInfo);
			}
		}
	}
}
