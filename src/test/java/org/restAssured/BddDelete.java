package org.restAssured;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;
public class BddDelete {

	//10.How to write DELETE Method in BDD Style ?

	@Test
	public void deleteMethod() {
		given()
			.baseUri("https://automationexercise.com/")
		.when()
			.delete("api/brandsList/8")
		.prettyPrint();
	}
}
