import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.testng.Assert;
public class script1 {
	public static void main(String[] args) {
		
	
	
	RestAssured.baseURI="https://reqres.in/api/";
	
	String res = given().log().all().     pathParam("value", "users").body(payload.payload())
	.when().post("{value}")
	
	.then() .log().all()
	.assertThat().statusCode(201).extract().asString();
	
			System.out.println(res);
	JsonPath js =new JsonPath(res);
	 String id = js.getString("id");
	 System.out.println(id);
     JsonPath js1 = testtt.reuseable(res);
     
    String id2 = js1.getString("id");
      //Assert.assertEquals(id, "1");
    assertThat(id, equalTo("2"));
     
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}}