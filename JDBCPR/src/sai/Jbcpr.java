package sai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Jbcpr {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/saikiran";
		String user="root",password="root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url, user, password);
	    Statement st = con.createStatement();
	    String query="INSERT INTO PRODUCT(NAME,CODE,PRICE,QUANTITY) VALUES('shoes','s',1000,1)";
	    int rows=st.executeUpdate(query);
	    if(rows>0) {
	    	System.out.println("row is created");
	    }
	    else {
	    	System.out.println("not created something wrong");

	}

}
}
