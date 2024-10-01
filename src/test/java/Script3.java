import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;


public class Script3 {
	
	
	@Test(dataProvider="dfgh")
	public void dattaprovider(String dd,int fff) {
		
		System.out.println("fghj");
		String res = RestAssured .baseURI="http://216.10.245.166";
		given().
		//param("resources", "Library").param("endpoint","Addbook.php").
		body(payload.LibraryPayLoad(dd,fff)).
		when().post("/Library/Addbook.php").
		then().log().all().assertThat().statusCode(200).extract().asString();
	System.out.println(res);
		
		
		
	}
	
	@DataProvider(name="dfgh")
	public Object[][]  getData(){

		
		//return new Object[][] {‌{"ojfwty","9363"},{"cwetee","4253"}, {"okmfet","533"} };


	 return new Object[][] {{"denk",12},{"dsa",345}};
	
	}
	

}
