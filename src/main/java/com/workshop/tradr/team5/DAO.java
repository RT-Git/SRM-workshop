package com.workshop.tradr.team5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAO {
	
public int addCustomer (Customer obj) throws ClassNotFoundException  {
		
		
		String dbUrl = "jdbc:mysql://localhost:3306/tradr?allowMultiQueries=true&useSSL=false";
        String dbClass = "com.mysql.jdbc.Driver";
        String userdb = "root" , passdb = "";
        
        int i=0;
        try {
            
            Class.forName(dbClass);
            Connection con = DriverManager.getConnection(dbUrl, userdb, passdb); 
            String query = "INSERT into tradr.customer VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, 0);
            pst.setString(2, obj.customer_name);
            pst.setString(3, obj.username);
            pst.setString(4, obj.password);
            pst.setString(5, obj.secretQ);
            pst.setString(6, obj.secretA);
            pst.setDate(7, java.sql.Date.valueOf(obj.dob));
            pst.setString(8, obj.gender);
            pst.setString(9, obj.invest_trader);
            pst.setInt(10 , Integer.parseInt(obj.household_id));
            pst.setString(11, "General");
            
            i=pst.executeUpdate();
            con.close();
        }
        catch (SQLException e) {
                        e.printStackTrace();
        }     
        
        return i;
	}

}
