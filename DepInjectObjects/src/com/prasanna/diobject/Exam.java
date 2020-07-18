package com.prasanna.diobject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");

		Student stu = context.getBean("stu", Student.class);
		Employee emp = context.getBean("emp", Employee.class);
		stu.answering();
		emp.answering();

		/*
		 * Student s = new Student();
		 * 
		 * MathCheat m = new MathCheat(); s.setMc(m); s.answering();
		 */

	}

}
