package com.DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	private static Connection conn;

	public static Connection getConn() {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/job_portal", "root", "9923388663");
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//
//		return conn;
//	}
//	
	
	String url="jdbc:mysql://localhost:3306/job_portal";
	String un="root";
	String pass="9923388663";
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection(url,un,pass);	
	} catch (Exception e) {
		
		System.out.println(e);
	}
	return conn;
		
	}
}
