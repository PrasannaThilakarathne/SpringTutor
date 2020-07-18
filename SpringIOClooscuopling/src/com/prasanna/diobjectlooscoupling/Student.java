package com.prasanna.diobjectlooscoupling;

public class Student {

	private Cheat cheat;
	private String name;

	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void answering() {
		cheat.cheating();
		System.out.println(name + " is started to cheating");
	}

}
