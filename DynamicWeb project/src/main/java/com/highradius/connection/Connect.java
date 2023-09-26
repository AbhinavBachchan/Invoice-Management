package com.highradius.connection;
import java.sql.*;

public class Connect {
	static final String URL = "jdbc:mysql://localhost:3306/db";
	static final String USER = "root";
	static final String PASS = "Abhi@8700";
	public static Connection connect(){
		Connection con = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				con = DriverManager.getConnection(URL, USER, PASS);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return con;
	}
}

