package com.food.order.registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.order.registration.model.User;
import com.food.order.registration.model.RegistrationResult;
import com.food.order.registration.repository.RegistrationRepository;

@Service
public class RegistrationService {
	@Autowired
	private RegistrationRepository registrationRepository;

	public RegistrationResult register(final User request) {
		System.out.println("RegistrationService.register()");
		return registrationRepository.register(request);
	}
}
