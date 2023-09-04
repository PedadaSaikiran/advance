package Factory;

import Dao.Dao;
import Dao.DaoImpl;

public class DaoFactory {
	public static Dao daoFactory() {
		return new DaoImpl();
	}

}
