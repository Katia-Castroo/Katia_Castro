package br.com.caelum.jdbc;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


public class ConnectionFactory {
	public Connection getConnecton() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/kj21", "root", "");
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	
}
