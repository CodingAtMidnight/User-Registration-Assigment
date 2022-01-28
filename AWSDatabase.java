package com.neonsense.user_registration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AWSDatabase {
	
		public void createTable() {
			final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
			final String DB_URL = "jdbc:mysql://userdatabase.ci1apbcfs5qc.us-east-1.rds.amazonaws.com:3306/users";
			final String USER = "admin";
			final String PASS = "admin123";
			
			Connection conn = null;
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("Connecting to database...");
				
				conn = DriverManager.getConnection(DB_URL,USER,PASS);
				
				System.out.println("Creating table in given database...");
				Statement atmt = conn.createStatement();
				
				//String sql = "INSERT INTO `testTable` (`AccountID`,`firstName`,`lastName`,`age`) VALUES ( 4,'Jay','C',21);";

			      String sql = "CREATE TABLE TestTable " + 
			                   "(AccountId INTEGER not NULL, " +
			                   " firstName VARCHAR(255), " + 
			                   " lastName VARCHAR(255), " + 
			                   " age INTEGER(30))"; 	
			      
			      atmt.executeUpdate(sql);
			      System.out.println("Created table in given database...");
			} catch (SQLException | ClassNotFoundException e){
				((Throwable) e).printStackTrace();
			}
		}
		
}

