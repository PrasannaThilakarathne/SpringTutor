package com.prasanna.code;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		
		JDBCConnection jdbcConnection = context.getBean("jdbcbean", JDBCConnection.class);
		jdbcConnection.display();
		jdbcConnection.getConnection();
	}
}
