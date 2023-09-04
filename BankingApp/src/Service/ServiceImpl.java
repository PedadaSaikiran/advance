package Service;

import java.sql.ResultSet;
import java.sql.SQLException;

import Dao.Dao;
import Dto.Emp;
import Factory.DaoFactory;

public class ServiceImpl implements services {
	Dao dao=DaoFactory.daoFactory();
	@Override
	public int insert(Emp emp) throws ClassNotFoundException, SQLException {
	
		return dao.insertEmp(emp);
	}

	@Override
	public int update(Emp emp) throws ClassNotFoundException, SQLException {
		
		return dao.updateEmp(emp);
	}

	@Override
	public int delete(int empid) throws ClassNotFoundException, SQLException {
		
		return dao.deleteEmp(empid);
	}

	@Override
	public ResultSet display() throws ClassNotFoundException, SQLException {
		
		return dao.displayEmp();
	}

}
