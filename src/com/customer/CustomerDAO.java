package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {

	     public static Customer validate(String userName,String password) {
	   
	    	Connection con=null;
	 		ResultSet rs=null;
	 		PreparedStatement ps = null; 
	    	 
	    	Customer cust = null;
	    	
			try {
	    		 
	    		con = DbConnection.getConnection();
	    		 String sql="select * from customer where username=? and password=?";
	    		 ps = con.prepareStatement(sql);
	    		 
	    		  ps.setString(1, userName);
	    		  ps.setString(2, password);
	    		  
	    		  rs = ps.executeQuery();
	    		  
	    		  
	    		  while(rs.next()) { 
	  			 cust = new Customer(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
	  			}
	    	
	    	 }
	    	 
	    	 
	    	 catch(SQLException e) {
	 			e.printStackTrace();
	 		}finally {
	 			try {
	 				if(con!=null) {
	 					con.close();
	 				}if(ps!=null) {
	 					ps.close();
	 				}if(rs!=null) {
	 					rs.close();
	 				}
	 			}catch(SQLException e) {
	 				e.printStackTrace();
	 			}
	 		}
	    
	    	return cust; 
	     }
	     
	     public void insertDetails(Customer c) {
	 		
	 		Connection con = null;
	 		PreparedStatement pmt = null;
	 		
	 		try {
	 			
	 			con = DbConnection.getConnection();
	 			String query = "insert into customer(name, email, phone, username,password) values(?,?,?,?,?)";
	 			pmt=con.prepareStatement(query);
	 	
	 			pmt.setString(1,  c.getName());
	 			pmt.setString(2,  c.getEmail());
	 			pmt.setString(3,  c.getPhone());
	 			pmt.setString(4,  c.getUserName());
	 			pmt.setString(5,  c.getPassword());
	 			
	 			int n = pmt.executeUpdate();
	 			
	 		} catch(SQLException e) {
	 			e.printStackTrace();
	 		} finally {
	 			try {
	 				if(pmt != null) {
	 					pmt.close();
	 				} if(con!=null) {
	 					con.close();
	 				}
	 			} catch(SQLException e) {
	 				e.printStackTrace();
	 			}
	 		}
	 	}
	     
	     
	     
}