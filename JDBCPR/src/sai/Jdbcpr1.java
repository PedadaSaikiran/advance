package sai;

import java.sql.Connection;     
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Jdbcpr1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/saikiran";
		String user="root",password="root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		String Query ="UPDATE PRODUCT SET NAME=?, PRICE=? WHERE QUANTITY<?";
		Connection con=DriverManager.getConnection(url, user, password);
		PreparedStatement pst = con.prepareStatement(Query);
		pst.setString(1, "Mango");
		pst.setInt(2, 56);
		pst.setInt(3, 10);
		int rows =pst.executeUpdate();
		System.out.println(rows);
		
		

	}

}
   