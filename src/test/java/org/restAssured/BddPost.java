package org.restAssured;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
public class BddPost {

	//8.How to write POST Method in BDD Style ?

	@Test
	public void postMethod() {
		given()
			.baseUri("https://automationexercise.com/")
			.header("Content-Type","application/json")
			.body("{\\\"id\\\": 8, \\\"brand\\\": \\\"Polos\\\"}")
		.when()
			.post("api/brandsList/8")
		.prettyPrint();
	}
}
