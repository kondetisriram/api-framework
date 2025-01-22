package com.api.tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class LoginTests {

	@Test
	public void loginTest() {
		
		Response res =RestAssured.given().baseUri("http://64.227.160.186:8080/api/auth/")
		.contentType(ContentType.JSON)
		.body("{\"username\": \"asdfzxcv\", \"password\": \"Pass@12345\"}")
		.post("login");
		
		System.out.println(res.asPrettyString());
	}
	
}
