    package pro;

import java.sql.*;

public class DaoImpl  implements Dao{

	@Override
	public int insertProduct(Dto dto) throws ClassNotFoundException, SQLException {
		Connection con =ConnectionFactory.getConnection();
		String query="INSERT INTO PRODUCT VALUES(?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(query);
		pst.setString(1,dto.getName());
		pst.setString(2,dto.getCode());
		pst.setInt(3, dto.getPrice());
		pst.setDouble(4, dto.getQuantity());
		return pst.executeUpdate();
		
	}

	@Override
	public int deleteProduct(String code) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con =ConnectionFactory.getConnection();
		String query="DELETE FROM PRODUCT WHERE CODE=?";
		PreparedStatement pst =con.prepareStatement(query);
		pst.setString(1,code);
		return pst.executeUpdate();
	}

	@Override
	public int updateProduct(Dto dto) throws ClassNotFoundException, SQLException {
		Connection con =ConnectionFactory.getConnection();
		String query=" UPDATE PRODUCT SET NAME=?,PRICE=?,QUANTITY=? WHERE CODE=?";
		PreparedStatement pst =con.prepareStatement(query);
		pst.setString(1, dto.getName());
		pst.setInt(2, dto.getPrice());
		pst.setDouble(3, dto.getQuantity());
		pst.setString(4, dto.getCode());
		return pst.executeUpdate();
	}

	@Override
	public ResultSet displayProduct() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con =ConnectionFactory.getConnection();
		String query="SELECT * FROM PRODUCT";
		PreparedStatement pst =con.prepareStatement(query);
	
		return pst.executeQuery();
	
	}

	

	

}
