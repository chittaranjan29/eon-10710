package com.db.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.PreparableStatement;

public class UpdateOperation {

	public static void main(String[] args) {
		
		try {
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db","root","root");
			String sql="update student set sname=?, email=?, roll=?, class=? where id=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, "Arun");
			preparedStatement.setString(2, "arun@gmail.com");
			preparedStatement.setInt(3, 9);
			preparedStatement.setString(4, "XII");
			preparedStatement.setInt(5, 66555);
			
			if(preparedStatement.executeUpdate()>0)
			{
				System.out.println("Record Updated!!");
			}
			else
			{
				System.out.println("Problemin update operation!!");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		

	}

}
