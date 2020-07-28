package com.prasanna.code;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		System.out.println("Bean file loaded");
		Collage collage = context.getBean("collageBean" , Collage.class);
		System.out.println("The collage object created by spring is : "+collage);

	}

}
