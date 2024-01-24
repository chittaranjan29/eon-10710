package com.db.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class TableInfoUsingResultSetMetaData {

	public static void main(String[] args) {
		
		try {
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db", "root", "root");
			PreparedStatement preparedStatement=connection.prepareStatement("select * from student");
			ResultSet resultSet=preparedStatement.executeQuery();
			
			ResultSetMetaData metaData=resultSet.getMetaData();		
			
			System.out.println("Number of columns: "+metaData.getColumnCount());
			System.out.println("Column Name: "+metaData.getColumnName(3));
			System.out.println("Column Type: "+metaData.getColumnType(3));
			System.out.println("Display Size: "+metaData.getColumnDisplaySize(3));
			System.out.println("label: "+metaData.getColumnLabel(3));
			System.out.println("Column class Name: "+metaData.getColumnClassName(3));
			System.out.println("Schema Name: "+metaData.getSchemaName(1));
			
		
		
		} 
		
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
