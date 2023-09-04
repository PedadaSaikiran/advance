package Service;

import java.sql.ResultSet;
import java.sql.SQLException;

import Dto.Emp;

public interface services {
	public int insert(Emp emp) throws ClassNotFoundException, SQLException;
	public int update(Emp emp) throws ClassNotFoundException, SQLException;
	public int delete(int empid) throws ClassNotFoundException, SQLException;
	public ResultSet display() throws ClassNotFoundException, SQLException;
}
