package com.prasanna.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("collageBean") // if not provide bean name it default take class name starting with lowercase
public class Collage {
	@Autowired
	private Principal Principal;
	
	@Autowired
	@Qualifier("mathTeacher")
	private Teacher Teacher;
	
	
	private String collageName;
	
	/*
	 * public Collage(Principal principal) { Principal = principal; }
	 */
	/*@Autowired
	public void setPrincipal(Principal principal) {
		Principal = principal;
	}
	
	@Autowired
	public void setTeacher(Teacher teacher) {
		Teacher = teacher;
	}
	*/
	@Required
	@Value("${college.name}")
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}

	public void test() {
		System.out.println("Test method called");
		Principal.principalinfor();
		Teacher.teach();
		System.out.println("Collage name is : "+collageName);
	}

	
}
