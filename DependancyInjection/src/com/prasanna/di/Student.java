package com.prasanna.di;

public class Student {
	private int id;
	private String Name;
	
	public Student(int id) {
		this.id=id;
	}
	public Student(int id, String name) {
		this.id=id;
		this.Name=name;
	}

	public void displyInfo() {
		System.out.println("Student Name: "+Name +" and id: "+id);
	}
}
