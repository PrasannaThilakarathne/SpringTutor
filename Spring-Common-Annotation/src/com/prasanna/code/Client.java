package com.prasanna.code;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CollageConfig.class);
		Collage collage = context.getBean("collageBean" , Collage.class);
		System.out.println("The collage object created by spring is : "+collage);
		collage.test();

	}

}
