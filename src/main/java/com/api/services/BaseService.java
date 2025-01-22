package com.api.services;

import static io.restassured.RestAssured.*;

import com.api.filters.LoggingFilter;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {

	private static final String BASE_URI = "http://64.227.160.186:8080/";
	
	private RequestSpecification requestSpecification;

	static {
		RestAssured.filters(new LoggingFilter());
	}
	public BaseService() {
		requestSpecification = given().baseUri(BASE_URI);
	}

	public Response postRequest(Object payload, String basePath) {
		return requestSpecification.contentType(ContentType.JSON)
				.body(payload)
				.post(basePath);
	}

}
