package com.prasanna.code;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("Im your math teacher");
	}

}
