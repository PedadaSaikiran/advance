package Factory;

import Service.ServiceImpl;
import Service.services;

public class ServiceFactory {
	public static services serviceFactory() {
		return new ServiceImpl();
	}
}
