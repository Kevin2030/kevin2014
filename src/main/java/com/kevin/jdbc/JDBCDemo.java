package com.kevin.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCDemo {

	public static void main(String[] args) throws Exception {
		Class.forName("");
		Connection conn = DriverManager.getConnection("");
		PreparedStatement ps = conn.prepareStatement("");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			rs.getInt("");
		}
		
		rs.close();
		ps.close();
		conn.close();
	}
}
