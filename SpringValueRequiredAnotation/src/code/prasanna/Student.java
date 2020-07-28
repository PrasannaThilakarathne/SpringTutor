package code.prasanna;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

@SuppressWarnings("deprecation")
public class Student {
	@Value("${student.name}")
	private String name;
	@Value("${student.interestedcourse}")
	private String interestedCourse;
	private String hobby;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	//@Required //mandatory field
	//public void setInterestedCourse(String interestedCourse) {
	//	System.out.println("Using set method");
	//	this.interestedCourse = interestedCourse;
	//}
	@Value("${student.hobby}")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	
	public void displayStudentinfo() {
		System.out.println("Student Name " + name);
		System.out.println("Student interestedCourse " + interestedCourse);
		System.out.println("Student hobby " + hobby);
	}
	
}
