package com.ash.jdbc.dao;
import java.sql.*;
public class AccountDAO {

	
		public static void main(String[] args) {

	        try {
	            Connection con = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/world",
	                "root",
	                "Lulu@341"
	            );

	            System.out.println("Database connected successfully");

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

}
