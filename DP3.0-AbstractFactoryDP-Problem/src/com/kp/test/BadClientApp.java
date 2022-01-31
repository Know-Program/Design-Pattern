package com.kp.test;

import com.kp.dao.DAO;
import com.kp.factory.DBDAOFactory;
import com.kp.factory.ExcelDAOFactory;

public class BadClientApp {
	public static void main(String[] args) {
		DAO studentDAO = DBDAOFactory.createDAO("student");
		DAO courseDAO = ExcelDAOFactory.createDAO("course");
		studentDAO.insert();
		courseDAO.insert();
	}
}
