package com.prasanna.serviceproviders;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceCenter {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		Mobitel mobi = context.getBean("mobitelbean", Mobitel.class);
		mobi.deploye();
		Dialog dia = context.getBean("dialogbean",Dialog.class);
		dia.deploye();
	}

}
