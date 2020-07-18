package com.prasanna.diobjectlooscoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");

		Student stu = context.getBean("stubean", Student.class);
		stu.answering();
		

		/*
		 * Student s = new Student();
		 * 
		 * MathCheat m = new MathCheat(); s.setMc(m); s.answering();
		 */

	}

}
