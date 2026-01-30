package com.ash.jdbc.dao;
import java.sql.*;


public class AccountDAO {

	
		public static void main(String[] args) {

	        try {
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","*");

	            System.out.println("Database connected successfully");
	            
	            Statement statement = con.createStatement();
	            
//	            int result = statement.executeUpdate("insert into account values(2,'Spider','Man',200000)");
//	            System.out.println(result + " rows inserted");
	            
	            ResultSet rs = statement.executeQuery("select * from account");
	            
	            while(rs.next()) {
	            
	            System.out.println(rs.getInt(1));
	            System.out.println(rs.getString(2));	
	            System.out.println(rs.getString(3));	
	            System.out.println(rs.getInt(4));	
	            
	            }
	            

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

}
