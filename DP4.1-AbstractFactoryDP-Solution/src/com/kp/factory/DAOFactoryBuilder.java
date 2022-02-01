// DAOFactoryBuilder.java
package com.kp.factory;

// class acting as AbstractFactory 
// (factory on factories or super factory)
public class DAOFactoryBuilder {
	// abstract factory logic
	// method returning one of the factories object
	public static DAOFactory buildDAOFactory(String storetype) {
		if (storetype.equalsIgnoreCase("db")) {
			return new DBDAOFactory();
		} else if (storetype.equalsIgnoreCase("excel")) {
			return new ExcelDAOFactory();
		} else {
			throw new IllegalArgumentException("Invalid store type");
		}
	}
}