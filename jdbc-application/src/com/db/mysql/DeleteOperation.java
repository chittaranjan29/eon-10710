package com.db.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteOperation {

	public static void main(String[] args) {
		try {
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db","root","root");
			String sql="delete from student where id=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, 66555);
			
			if(preparedStatement.executeUpdate()>0)
			{
				System.out.println("Record deleted!!");
			}
			else
			{
				System.out.println("Problem in delete operation!!");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		


	}

}
