package com.food.order.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.food.order.registration.model.User;
import com.food.order.registration.model.RegistrationResult;
import com.food.order.registration.service.RegistrationService;

@RestController
public class RegistrationController {
	@Autowired
	private RegistrationService registrationService;

	@RequestMapping(value = "/register", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public RegistrationResult register(@RequestBody final User request) {
		System.out.println("RegistrationController.register()");
		System.out.println("Values are- "+"Name:"+request.getName()+",Email:"+request.getEmail()+", Password:"+request.getPassword());
		return registrationService.register(request);
	}
}
