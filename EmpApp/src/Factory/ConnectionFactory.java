package Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 String url="jdbc:mysql://localhost:3306/saikiran";
			String user="root",password="root";
			return DriverManager.getConnection(url, user, password);
	}
}
