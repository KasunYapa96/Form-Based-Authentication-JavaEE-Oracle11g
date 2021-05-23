package com.customer;
import java.sql.*;

public class DbConnection {
	  public static Connection getConnection() {
		  
		  
		  Connection con=null;
		    try {
			  
			  Class.forName("oracle.jdbc.driver.OracleDriver");
			  con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","MANAGER");
			  
			  
		  }catch(ClassNotFoundException c) {
			  c.printStackTrace();
		  }catch(SQLException s) {
			  s.printStackTrace();
		  }
		  
		  return con;
	  }
		
	
}