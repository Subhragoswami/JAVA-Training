package com.josh.java.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class UsingStatement {
	public static void main(String args[]) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc", "postgres", "123456");
			

			Statement stmt = con.createStatement();
			//stmt.executeQuery("insert into Data values(55,'Subhra','Jhargram')");

			ResultSet rs = ((java.sql.Statement) stmt).executeQuery("select * from Data");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
