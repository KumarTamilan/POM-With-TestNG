package org.restAssured;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
public class BddGet {

	//7.How to write GET Method in BDD Style ?

	@Test
	public void getMethod() {
		given()
			.baseUri("https://automationexercise.com/")
		.when()
			.get("api/productsList")
		.prettyPrint();
		
		
		
	}
}
