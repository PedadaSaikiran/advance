package StudentApp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Studentmain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		 Connection con=ConnectionFactory.getConnection();
		 String Query="DELETE FROM STUDENT WHERE NAME=?";
		 PreparedStatement pst = con.prepareStatement(Query);
		 pst.setString(1,"venkata");
		 System.out.println(pst.executeUpdate());
		 
		

	}

}
