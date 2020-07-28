package com.prasanna.code;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class MySQLAccess {
	private Connection con = null;
	private Statement statement = null;
	private ResultSet resultset = null;
	
	final private String url = "jdbc:mysql://localhost:3306/construction";
	final private String user = "root";
	final private String password = "";
	
	public void readDatabase() throws Exception {
		 try {
		      
		      con = (Connection) DriverManager.getConnection(url, user, password );
		      statement = (Statement) con.createStatement();
		      resultset = statement.executeQuery("select * from construction.projects");
		      System.out.println(resultset);
		      
		    } catch (Exception e) {
		      throw e;
		    }
	}
	}

