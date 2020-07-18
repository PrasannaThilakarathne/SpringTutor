package com.prasanna.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {

	public Human() {
		
	}
	private Heart heart;

	@Autowired
	public Human(Heart heart) {
		this.heart = heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public void breathing() {
		if (heart != null) {
			heart.pumping();
		} else {
			System.out.println("You are dead!");
		}
	}
}
