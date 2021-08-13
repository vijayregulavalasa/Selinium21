package com.automation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.protocol.Resultset;

public class JDBCtest1 {

	@Test
	public  void MySQLTest() throws SQLException {
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/automation", "root", "root");
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("select * from employee;");
		
		while(resultSet.next()) {
		System.out.print(resultSet.getString("id")+ "\t");
		System.out.print(resultSet.getString("name") + "\t");
		System.out.println(resultSet.getString("salary"));
		}
		
	connection.close();
	}
	
	@Test
	public void rowsDescOrderSQL() throws Exception{
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/automation","root","root");
		Statement statement=connection.createStatement();
		ResultSet resultSet= statement.executeQuery("select * from employee order by salary desc;");
		
		while(resultSet.next()){
		System.out.print(resultSet.getString("id") + "\t");
		System.out.print(resultSet.getString("Name") + "\t");
		System.out.println(resultSet.getString("salary"));
		}
	}
	
	@Test
	public void groupBySQL() throws SQLException {
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/automation","root","root");
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("select deptNo, count(*) from employee group by deptNo;");
		while(resultSet.next()) {
			
		
		System.out.print(resultSet.getString(1) + "\t");
		System.out.println(resultSet.getString(2));
		
		}
		
	}
	
	

}
