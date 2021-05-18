package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection getConnection() throws Exception, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String username = "SUHAIL";
		String password = "sss";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("seccec");
		return con;
	}
}
