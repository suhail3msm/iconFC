package model;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class SupplierDAO {
	public String insertDetails(Supplier supplier) {
		String result = "data insert success";
		try {
			Connection con = DBConnection.getConnection();
			PreparedStatement stmt = con.prepareStatement(
					"INSERT INTO supplier (client_code, name, address, city, state, province, country, email, mobile, credit, supplier_lmt, invoice_payment) VALUES (?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?, ?)");

			stmt.setString(1, supplier.getClient_Code());
			stmt.setString(2, supplier.getName());
			stmt.setString(3, supplier.getAddress());
			stmt.setString(4, supplier.getCity());
			stmt.setString(5, supplier.getState());
			stmt.setString(6, supplier.getProvince());
			stmt.setString(7, supplier.getCountry());
			stmt.setString(8, supplier.getEmail());
			stmt.setLong(9, supplier.getMobile());
			stmt.setString(10, supplier.getCredit());
			stmt.setString(11, supplier.getSupplier_lmt());
			stmt.setString(12, supplier.getInvoice_payment());
			stmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return result;

	}
}
