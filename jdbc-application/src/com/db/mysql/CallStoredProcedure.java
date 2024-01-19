package com.db.mysql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class CallStoredProcedure {

	public static void main(String[] args) {
		try {
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db","root","root");
			CallableStatement callableStatement=connection.prepareCall("{call getStudentRecordById(?)}");
			callableStatement.setInt(1, 12322);
			
			ResultSet resultSet=callableStatement.executeQuery();
			
			
			while(resultSet.next())
			{
				System.out.print(resultSet.getInt("id")+" ");
				System.out.print(resultSet.getString("sname")+" ");
				System.out.print(resultSet.getString("class")+" ");
				System.out.print(resultSet.getInt("roll")+" ");
				System.out.print(resultSet.getString("email")+" ");
				System.out.println();
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		

	}

}
