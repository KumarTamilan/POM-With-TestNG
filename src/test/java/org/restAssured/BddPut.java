package org.restAssured;

import static io.restassured.RestAssured.*;
public class BddPut {

	//9.How to write PUT Method in BDD Style ?

	public void putRequest() {
		given()
			.baseUri("https://automationexercise.com/")
			.header("Content-Type","application/json")
			.body("{\"id\": 8, \"brand\": \"Polos\"}")
		.when()
			.put("api/brandsList/8")
		.prettyPrint();
	}
}
