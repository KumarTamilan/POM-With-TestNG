package org.restAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class NonBddGetRequest {

	//3.How to write GET Method in Non BDD ?

	@Test
	public void getRequest() {
		RestAssured.baseURI = "https://automationexercise.com/";
		
		RequestSpecification requestSpecification = RestAssured.given();
		Response response = requestSpecification.request(Method.GET,"api/productsList");
		
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusLine());
	}
}
