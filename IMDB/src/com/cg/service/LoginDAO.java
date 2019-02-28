package com.cg.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
	public boolean validate(String username,String pasword) throws Exception
	{
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","orcl11g");
		String count=null;
		String query = "select * from register where username=? and password=?";
		PreparedStatement pStatement = conn.prepareStatement(query);
		pStatement.setString(1, username);
		pStatement.setString(2, pasword);
		ResultSet res = pStatement.executeQuery();
		while(res.next())
		{
			count = res.getString(username);
		}
		if(count!=null)
			return true;
		else
			return false;
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;		
			
			
	}
}
