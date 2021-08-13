package com.automation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;


public class JDBCTest2{
	@Test
	public void insertRowSQL() throws Exception{

		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/automation", "root", "root");
	
	
	Statement statement=connection.createStatement();
	boolean test=statement.execute("insert into employee values(6666,'vijay','president',null,9999,10)");
	
	}
	
	
}
 