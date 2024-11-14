package org.restAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class NonBddDeleteRequest {

	//6.How to write DELETE Method in Non BDD ?

	@Test
	public void deleteMethod() {
		RestAssured.baseURI = "https://automationexercise.com/";
		//GET			:    	200 Ok
		//POST 		:		201 Created
		//PUT   		:    	200 Ok
		//DELETE	: 		200 Ok
		//PATCH		:		200 Ok
		RequestSpecification requestSpecification = RestAssured
				.given();
		Response response = requestSpecification.request(Method.DELETE,"api/brandsList/8");
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.asPrettyString());
	}
}
