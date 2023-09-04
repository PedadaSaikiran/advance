package pro;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface Dao {

	public int insertProduct(Dto dto) throws ClassNotFoundException, SQLException;
	public int deleteProduct(String code) throws ClassNotFoundException, SQLException;
	public int updateProduct(Dto dto) throws ClassNotFoundException, SQLException;
	public ResultSet displayProduct() throws ClassNotFoundException, SQLException;
}
