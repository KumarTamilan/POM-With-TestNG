package org.restAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class NonBddPostRequest {

	//4.How to write POST Method in Non BDD ?

	@Test
	public void postRequest() {
		RestAssured.baseURI = "https://automationexercise.com/";
		
		RequestSpecification requestSpecification = RestAssured.given()
				.header("Content-Type","application/json")
				.body("{\"id\": 8, \"brand\": \"Polos\"}");
		
		Response response = requestSpecification.request(Method.POST,"api/brandsList/8");
	
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.asPrettyString());
	}
}
