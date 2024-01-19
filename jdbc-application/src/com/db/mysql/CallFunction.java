package com.db.mysql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class CallFunction {

	public static void main(String[] args) {
		try {
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db","root","root");
			CallableStatement callableStatement=connection.prepareCall("{?=call getMaxStudentId()}");
			callableStatement.registerOutParameter(1, Types.INTEGER);
			
			callableStatement.execute();
			
			System.out.println(callableStatement.getInt(1));
			
		
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		


	}

}
