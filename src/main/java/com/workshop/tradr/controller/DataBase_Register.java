package com.workshop.tradr.controller;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class DataBase_Register {
	 Connection con;
	 DataBase_Register() {
	     try{
	    	 Class.forName("com.mysql.jdbc.Driver");
	    	 con=DriverManager.getConnection(  
	    			 "jdbc:mysql://localhost:3306/tradr");    
	    			     
	     }catch(Exception e){
	    	 
	     }
	    
	    }
	 
	 public boolean insertData(StorageOfData salad) throws SQLException{
	        PreparedStatement param=con.prepareStatement("insert into project1 values(?,?,?)");
	        param.setString(1, salad.getEmail());
	        param.setString(2, salad.getPassword());
	        param.setString(3, salad.getName());
	       int result= param.executeUpdate();
	        return result>0;
	    }
}
