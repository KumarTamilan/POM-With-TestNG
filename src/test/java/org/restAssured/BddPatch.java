package org.restAssured;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
public class BddPatch {

	//11.How to write PATCH Method in BDD Style ?

	@Test
	public void patchMethod() {
		given()
			.baseUri("https://automationexercise.com/")
			.header("Content-Type","application/json")
			.body("{\"id\": 8, \"brand\": \"Polos\"}")
		.when()
			.patch("When we want to modify a specific type of "
				+ "data or resource, we will provide it in this area.")
			//Like
			//.patch("api/brandsList/8")
		.prettyPrint();
	}
}
