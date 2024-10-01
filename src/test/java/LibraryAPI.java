import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static  io.restassured.RestAssured.*;
public class LibraryAPI {
	
	@Test
	public void postMethod()
	{
		RestAssured.baseURI="http://216.10.245.166";
		given().pathParam("library", "Library").pathParam("Addbook", "Addbook.php")
		.when().post("/{library}/{Addbook}").body();
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
