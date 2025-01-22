package com.api.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.listeners.TestListeners;
import com.api.models.requests.LoginRequest;
import com.api.models.requests.LoginResponse;
import com.api.services.AuthService;


import io.restassured.response.Response;

public class LoginTests3{

	@Test(groups= {"login"})
	public void loginTest() {
		
		AuthService authService = new AuthService();
		LoginRequest loginRequest = new LoginRequest("asdfzxcv","Pass@12345");
		
		Response res = authService.login(loginRequest) ;
		
		LoginResponse authResponse = res.as(LoginResponse.class);
		
		System.out.println(res.asPrettyString());
		
		System.out.println("Token: " + authResponse.getToken());
        System.out.println("Type: " + authResponse.getType());
        System.out.println("ID: " + authResponse.getId());
        System.out.println("Username: " + authResponse.getUsername());
        System.out.println("Email: " + authResponse.getEmail());
        System.out.println("Roles: " + authResponse.getRoles());
	}
	
	@Test(groups= {"login"})
	public void loginTest2() {
		
		AuthService authService = new AuthService();
		LoginRequest loginRequest = new LoginRequest("asdfzxcv","Pass@12345");
		
		Response res = authService.login(loginRequest) ;
		
		LoginResponse authResponse = res.as(LoginResponse.class);
		
		System.out.println(res.asPrettyString());
		
		System.out.println("Token: " + authResponse.getToken());
        System.out.println("Type: " + authResponse.getType());
        System.out.println("ID: " + authResponse.getId());
        System.out.println("Username: " + authResponse.getUsername());
        System.out.println("Email: " + authResponse.getEmail());
        System.out.println("Roles: " + authResponse.getRoles());
	}
}
