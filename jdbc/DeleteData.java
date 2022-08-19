package com.josh.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/*
This class is used to delete the existing value from the table
 */
public class DeleteData {
    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc", "postgres", "123456");
            System.out.println("Connection establised");
            preparedStatement = connection.prepareStatement("delete from student where SId=?;");
            System.out.println("Statement platform created");
            int num = 0;
            do {
                System.out.println("Delete Student data on their SId");
                preparedStatement.setInt(1, scanner.nextInt());
                preparedStatement.executeUpdate();
                System.out.println("Data deleted");
                System.out.println("press 1 to delete one more student data \n If not then press other than 1");
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
