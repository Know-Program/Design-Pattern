package com.kp.factory;

import com.kp.dao.DAO;
import com.kp.dao.DBCourseDAO;
import com.kp.dao.DBStudentDAO;

public class DBDAOFactory implements DAOFactory{
	// factory pattern
	public DAO createDAO(String type) {
		if(type.equalsIgnoreCase("student")) 
			return new DBStudentDAO();
		else if(type.equalsIgnoreCase("course"))
			return new DBCourseDAO();
		else 
			throw new IllegalArgumentException("Invalid DAO type");
	}

}
