package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import Dto.Emp;

public interface Dao {
	public int insertEmp(Emp emp) throws ClassNotFoundException, SQLException;
	public int updateEmp(Emp emp) throws ClassNotFoundException, SQLException;
	public int deleteEmp(int empid) throws ClassNotFoundException, SQLException;
	public ResultSet displayEmp() throws ClassNotFoundException, SQLException;

}
