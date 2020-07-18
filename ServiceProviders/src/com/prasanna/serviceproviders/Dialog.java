package com.prasanna.serviceproviders;

public class Dialog {
	private Services service;

	public void setService(Services service) {
		this.service = service;
	}
	
	public void deploye() {
		System.out.print("Welcome to Dialog Services..");
		service.newService();
	}
}
