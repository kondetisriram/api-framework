package com.api.tests;

import org.testng.annotations.Test;

import com.api.models.requests.LoginRequest;
import com.api.models.requests.LoginResponse;
import com.api.models.requests.SignupRequest;
import com.api.services.AuthService;
import com.api.services.BaseService;

import io.restassured.response.Response;

public class ForgotPasswordTest {

	@Test
	public void signupTest() {

		AuthService authService = new AuthService();

	
		Response res = authService.forgotpassword("asdf22@yopmail.com");

		System.out.println(res.asPrettyString());

	}

}
