import java.util.ArrayList;

import org.testng.Assert;

import io.restassured.path.json.JsonPath;

public class Script2 {
public static void main(String[] args) {
	

	String values = payload.practice();
	
	JsonPath vv = complex.data(values);
	Object Totalamount = vv.get("dashboard.purchaseAmount");
	System.out.println(Totalamount);
	int totalvalues = vv.getInt("courses.size()");
	
	System.out.println(totalvalues);
	ArrayList<String>al=new ArrayList<String>();
	int sum=0;
	for(int i=0;i<totalvalues;i++)
	{
		
	
	String coursetitle = vv.getString("courses.title["+i+"]");
	int price = vv.getInt("courses.price["+i+"]");
	int courseprice = vv.getInt(  "courses.copies["+i+"]");
	
	int srr = price*courseprice;
	System.out.println(srr);
	sum=sum+srr;
	//System.out.println(sum);

	
	
	if (coursetitle.equalsIgnoreCase("RPa")) {
		System.out.println(vv.getInt(  "courses.copies["+i+"]"));
		System.out.println("++++++");
		System.out.println(coursetitle);
	}

al.add(coursetitle);
	
	System.out.println(coursetitle);
	
	

	}
	System.out.println(sum);
	//System.out.println(purchaseAmount);
	
	Assert.assertEquals(sum,Totalamount );
}
	
	
}
