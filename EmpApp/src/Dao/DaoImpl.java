package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Dto.Emp;
import Factory.ConnectionFactory;

public class DaoImpl implements Dao {
	Emp emp = new Emp();

	@Override
	public int insertEmp(Emp emp) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionFactory.getConnection();
		String query="INSERT INTO EMP VALUES(?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1,emp.getEmpid() );
		pst.setString(2,emp.getName());
		pst.setString(3,emp.getRole());
		pst.setDouble(4,emp.getSalary());
		return pst.executeUpdate();
	}

	@Override
	public int updateEmp(Emp emp) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionFactory.getConnection();
		String query="UPDATE EMP SET NAME=?,ROLE=?,SALARY=? WHERE EMPID=?";
		PreparedStatement pst = con.prepareStatement(query);
		pst.setString(1,emp.getName());
		pst.setString(2,emp.getRole());
		pst.setDouble(3,emp.getSalary());
		pst.setInt(4, emp.getEmpid());
		return pst.executeUpdate();
	}

	@Override
	public int deleteEmp(int empid) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionFactory.getConnection();
		String query="DELETE FROM EMP WHERE EMPID=?";
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1,empid);
		return pst.executeUpdate();
	}

	@Override
	public ResultSet displayEmp() throws ClassNotFoundException, SQLException {
		Connection con=ConnectionFactory.getConnection();
		String query="SELECT * FROM EMP";
		PreparedStatement pst = con.prepareStatement(query);
		return pst.executeQuery();
	}
	

}
