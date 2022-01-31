package com.kp.test;

import com.kp.dao.DAO;
import com.kp.factory.ExcelDAOFactory;

public class GoodClientApp {
	public static void main(String[] args) {
		DAO studentDAO = ExcelDAOFactory.createDAO("student");
		DAO courseDAO = ExcelDAOFactory.createDAO("course");
		studentDAO.insert();
		courseDAO.insert();
	}
}
