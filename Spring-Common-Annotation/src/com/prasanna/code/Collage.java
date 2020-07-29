package com.prasanna.code;

import org.springframework.stereotype.Component;

@Component("collageBean") // if not provide bean name it default take class name starting with lowercase
public class Collage {

	private Principal Principal;

	private Teacher Teacher;
	
	
	/*
	 * public Collage(Principal principal) { Principal = principal; }
	 */

	public void setPrincipal(Principal principal) {
		Principal = principal;
	}
	
	
	public void setTeacher(Teacher teacher) {
		Teacher = teacher;
	}


	public void test() {
		System.out.println("Test method called");
		Principal.principalinfor();
		Teacher.teach();
	}

	
}
