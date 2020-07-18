package com.prasanna.diobject;

public class Employee {
	
	private MathCheat mc;

	public void setMc(MathCheat mc) {
		this.mc = mc;
	}

	public void answering() {
		System.out.print("Employee...");
		mc.cheating();
	}
}
