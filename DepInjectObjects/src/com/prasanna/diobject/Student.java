package com.prasanna.diobject;

public class Student {
	private String name;
	private MathCheat mc;

	public void setName(String name) {
		this.name = name;
	}

	public void setMc(MathCheat mc) {
		this.mc = mc;
	}

	public void answering() {
		mc.cheating();
		System.out.println(name + " is started to cheating");
	}

}
