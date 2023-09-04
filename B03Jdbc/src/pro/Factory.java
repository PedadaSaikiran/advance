package pro;

public class Factory {
	public static  Dao getDao() {
		return new DaoImpl();
	}
}
