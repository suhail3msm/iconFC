package model;


import java.util.*;
import java.sql.*;



public class LoginDAO {
	
	    public String log(String username, String password) {
	    	 Login users = new Login();
	    	 Connection con;
	     	PreparedStatement stmt;
	 		String sql;
	 		ResultSet rs;
	         
	         try{
	             con = DBConnection.getConnection();
	     		sql = "SELECT * FROM login1 WHERE username=? and password=?";
	 			stmt = con.prepareStatement(sql);
	 			stmt.setString(1, username);
	 			stmt.setString(2, password);
	 			rs = stmt.executeQuery();
	             if(rs.next()){
	            	 users.setUsername(rs.getString(1));
	                 users.setUsername(rs.getString(2));
	             }else{
	                 return "false";
	             }
	         }catch(Exception e){
	             e.printStackTrace();
	         }
	    	return "true";
	    }
}
