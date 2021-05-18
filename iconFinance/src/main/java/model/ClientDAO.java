package model;


import java.util.List;
import java.sql.*;
public class ClientDAO {

    public String insertDetails(Client client) {
    	String resuld = "data insert success";
   try {
       Connection con = DBConnection.getConnection();
    	PreparedStatement stmt = con.prepareStatement("INSERT INTO CLIENT3 (NAME, ADDRESS, CITY, STATE, PROVINCE, COUNTRY, EMAIL, MOBILE, LOAN_ACC_NUM, BANK_CODE, CLIENT_LIMIT, VALID_FROM, VALID_TO, RATE_OF_INTEREST, CREDIT_PERIOD) VALUES (?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?, ?, ?,?,?)");  
    	
    	stmt.setString(1,client.getNAME());  
    	stmt.setString(2,client.getADDRESS());  
    	stmt.setString(3,client.getCITY()); 
    	stmt.setString(4,client.getSTATE());
    	stmt.setString(5,client.getPROVINCE());
    	stmt.setString(6,client.getCOUNTRY());
    	stmt.setString(7,client.getEMAIL());
    	stmt.setLong(8,client.getMOBILE());
    	stmt.setString(9,client.getLOAN_ACC_NUM());
    	stmt.setString(10,client.getBANK_CODE());
    	stmt.setString(11,client.getCLIENT_LIMIT());
    	stmt.setString(12,client.getVALID_FROM());
    	stmt.setString(13,client.getVALID_TO());
    	stmt.setString(14,client.getRATE_OF_INTEREST());
    	stmt.setString(15,client.getCREDIT_PERIOD());
        stmt.executeUpdate();
} catch (Exception e) {
    		e.printStackTrace();
    		return null;
		}
   return resuld;
	
    }
}
