package com.api.tests;

import org.testng.annotations.Test;

import com.api.services.BaseService;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class LoginTests2 extends BaseService{

	@Test
	public void loginTest() {
		
		Response res = postRequest("{\"username\": \"asdfzxcv\", \"password\": \"Pass@12345\"}", "login") ;
		/*
		 * RestAssured.given().baseUri("http://64.227.160.186:8080/api/auth/")
		 * .contentType(ContentType.JSON)
		 * .body("{\"username\": \"asdfzxcv\", \"password\": \"Pass@12345\"}")
		 * .post("login");
		 */
		
		System.out.println(res.asPrettyString());
	}
	
}
