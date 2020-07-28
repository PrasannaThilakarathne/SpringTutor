package com.prasanna.code;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;

import com.mysql.jdbc.Connection;

public class JDBCConnection {
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.username}")
	private String username;
	@Value("${jdbc.pasword}")
	private String password;
	@Value("${jdbc.driver}")
	private String driver;
	
	public void display() {
		System.out.println("User Name: "+username + "\nUser url: "+url+"\nuser password: "+password+"\ndriver: "+driver);
	}
	
	public void getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		Connection con = (Connection) DriverManager.getConnection(url, username, password);
		System.out.println("Connection Sucessfull "+con);
	}
}
