package com.prasanna.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		//System.out.println("Config file loaded");
		Student stu =context.getBean("stubean", Student.class);
		stu.displyInfo();
		
		Student stu1 =context.getBean("stubean1", Student.class);
		stu1.displyInfo();
		
		

	}

}
