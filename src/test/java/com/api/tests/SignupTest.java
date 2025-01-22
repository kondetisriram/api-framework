package com.api.tests;

import org.testng.annotations.Test;

import com.api.models.requests.LoginRequest;
import com.api.models.requests.LoginResponse;
import com.api.models.requests.SignupRequest;
import com.api.services.AuthService;
import com.api.services.BaseService;

import io.restassured.response.Response;

public class SignupTest {

	@Test
	public void signupTest() {

		AuthService authService = new AuthService();

		SignupRequest signupRequest = new SignupRequest.Builder()
				.username("asdf22")
				.password("asdf22")
				.email("asdf22@yopmail.com")
				.firstName("asdf2")
				.lastName("asdf2")
				.mobileNumber("1234567899")
				.build();

		Response res = authService.signup(signupRequest);

		System.out.println(res.asPrettyString());

	}

}
