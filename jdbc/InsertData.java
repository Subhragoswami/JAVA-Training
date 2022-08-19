package com.josh.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/*
This class is used to insert the data into database
 */
public class InsertData {
	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/jdbc";
		String user = "postgres";
		String password = "123456";
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		System.out.println("enter the number of Student");
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		try {
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("Connection establised");
			String query = "insert into student (SId,SName,ObtainedMarks) values(?,?,?);";
			preparedStatement = connection.prepareStatement(query);
			System.out.println("PrepareStatement platform created");
			int num = 0;
			do {
				System.out.println("Enter the SId,SName,ObtainedMarks out of 600");
				preparedStatement.setInt(1, scanner.nextInt());
				preparedStatement.setString(2, scanner.next());
				preparedStatement.setInt(3, scanner.nextInt());
				preparedStatement.executeUpdate();
				System.out.println("press 1 to insert one more student data \n If not then press other than 1");
				num = scanner.nextInt();
			} while (num == 1);

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (connection != null) {
					preparedStatement.close();
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
