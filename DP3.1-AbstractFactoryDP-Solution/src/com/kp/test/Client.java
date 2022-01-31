package com.kp.test;

import com.kp.dao.DAO;
import com.kp.factory.DAOFactory;
import com.kp.factory.DAOFactoryBuilder;

public class Client {
	public static void main(String[] args) {
		// create DAOFactory
		DAOFactory dbDAOFactory = DAOFactoryBuilder.buildDAOFactory("db");
		DAO studentDAO = dbDAOFactory.createDAO("student");
		DAO courseDAO = dbDAOFactory.createDAO("course");
		// insert student info to DB
		studentDAO.insert();
		// insert course info to DB
		courseDAO.insert();
	}
}
