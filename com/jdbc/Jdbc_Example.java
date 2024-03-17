package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_Example {

	public static void main(String[] args) throws SQLException{
		Connection connection=null;
		Statement statement=null;
		ResultSet resultset=null;
		
	String Url="jdbc:mysql://127.0.0.1:3306/codebegun_test_db";
	String UserName= "root";
	String Password="Root";
	String Query="Select *From employee_info";

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection=DriverManager.getConnection(Url, UserName, Password);
		statement=connection.createStatement();
		resultset=statement.executeQuery(Query);
		while(resultset.next())
		{
			System.out.println(resultset.getString("Name"));
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
		finally {
			connection.close();
			statement.close();
			resultset.close();
		}

	}

}
