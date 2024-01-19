package com.db.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnection {

	public static void main(String[] args) {
		try
		{
			//Step 1: Establishing a connection 
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db", "root", "root");
			
			//Step 2: Create a statement using connection object
			Statement statement=connection.createStatement();
			
			if(connection!=null)
			{
				System.out.println("Connected!!"); 
			}
			else
			{
				System.out.println("Problem in connection!!");
			}
			
			//Step 3: Execute or Update the Query
			ResultSet resultSet=statement.executeQuery("select * from student");
			
			
			while(resultSet.next())
			{
				System.out.print(resultSet.getInt("id")+" ");
				System.out.print(resultSet.getString("sname")+" ");
				System.out.print(resultSet.getString("class")+" ");
				System.out.print(resultSet.getInt("roll")+" ");
				System.out.print(resultSet.getString("email")+" ");
				System.out.println();
			}
				
			
				
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
