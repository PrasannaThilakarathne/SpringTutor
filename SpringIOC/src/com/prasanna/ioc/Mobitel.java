package com.prasanna.ioc;

public class Mobitel implements Sim {

	public Mobitel() {
		System.out.println("Mobitel Constructor called");
	}
	@Override
	public void calling() {
		System.out.println("Calling using Mobitel sim");
	}

	@Override
	public void browsing() {
		System.out.println("browsing using Mobitel sim");
	}

}
