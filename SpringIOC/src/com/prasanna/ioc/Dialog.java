package com.prasanna.ioc;

public class Dialog implements Sim {

	@Override
	public void calling() {
		System.out.println("Calling using Dialog sim");
	}

	@Override
	public void browsing() {
		System.out.println("browsing using Dialog sim");
	}

}
