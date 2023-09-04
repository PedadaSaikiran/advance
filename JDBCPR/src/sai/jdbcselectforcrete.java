package sai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcselectforcrete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/saikiran";
		String user = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		String query = "SELECT * FROM PRODUCT";
		ResultSet rs = st.executeQuery(query);
		while (rs.next()) {
			System.out.print(rs.getString(1) + "\t");
			System.out.print(rs.getString(2) + "\t");
			System.out.print(rs.getInt(3) + "\t");
			System.out.print(rs.getInt(4) + "\t");
			System.out.print(rs.getDouble(5) + "\t");
			System.out.print(rs.getDouble(6) + "\t");
			System.out.print(rs.getDouble(7) + "\t");
			System.out.println();

		}

	}

}
