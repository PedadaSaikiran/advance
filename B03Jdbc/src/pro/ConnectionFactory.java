package pro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	 public static Connection getConnection() throws ClassNotFoundException, SQLException {
		 String url="jdbc:mysql://localhost:3306/sai";
			String user="root",password="root";
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(url, user, password);
	 }
}
