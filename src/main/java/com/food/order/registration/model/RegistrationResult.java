package com.food.order.registration.model;

public class RegistrationResult {
	private Boolean status;
	private String errorMessage;

	public RegistrationResult(Boolean status, String errorMessage) {
		this.status = status;
		this.errorMessage = errorMessage;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(final Boolean status) {
		this.status = status;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(final String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
