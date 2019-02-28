package com.cg.service;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RegistrationDAO {

	public int insert(String username,String firstname,String lastname,String contact,String email,String password,String cpassword) throws Exception {
		String query = "insert into register values(?,?,?,?,?,?,?)";
		Connection conn = DB_Connection.getConnection();
		System.out.println(conn);
		PreparedStatement pStatement = conn.prepareStatement(query);
		pStatement.setString(1, username);
		pStatement.setString(2, firstname); 
		pStatement.setString(3, lastname);
		pStatement.setString(4, contact);
		pStatement.setString(5, email);
		pStatement.setString(6, password);
		pStatement.setString(7, cpassword);
		int output = pStatement.executeUpdate();
	return output;
	}

}
