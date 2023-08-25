package crudOperation;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class CreateUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//step1. Create the resuest the data/body
		HashMap map = new HashMap();
		map.put("name","Chaitra");
		map.put("job", "Tester");
		
		//step2. send a request
		RequestSpecification req =RestAssured.given();
		req.body(req);
		req.contentType(ContentType.JSON);
		req.post("https://reqres.in/api/users");
		
		//step3. validate the response
		req.then().log().all();
		
		

	}

}
