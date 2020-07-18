package com.prasanna.serviceproviders;

public class Mobitel {
	private Services service;

	public Mobitel(Services service) {
		this.service = service;
	}

	public void deploye() {
		System.out.print("Welcome to Mobitel Services..");
		service.newService();
	}
}
