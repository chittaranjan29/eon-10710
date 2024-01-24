package com.db.mysql;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseInfoUsingDatabaseMetada {

	public static void main(String[] args) {
		
		try 
		{
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db", "root", "root");
			DatabaseMetaData metaData=connection.getMetaData();
			
			System.out.println("Driver Name:"+metaData.getDriverName());
			System.out.println("Driver version:"+metaData.getDriverVersion());
			System.out.println("User Name:"+metaData.getUserName());
			System.out.println("Database URL:"+metaData.getURL());
			System.out.println("Product Name:"+metaData.getDatabaseProductName());
			System.out.println("Product version:"+metaData.getDatabaseProductVersion());
			
		}
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
